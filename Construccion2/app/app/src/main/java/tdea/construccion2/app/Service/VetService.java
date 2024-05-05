package tdea.construccion2.app.Service;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdea.construccion2.app.dao.ClinicHistoryDao;
import tdea.construccion2.app.dao.LoginDao;
import tdea.construccion2.app.dao.OrderDao;
import tdea.construccion2.app.dao.PersonDao;
import tdea.construccion2.app.dao.PetsDao;
import tdea.construccion2.app.dao.UserDao;
import tdea.construccion2.app.dto.BillsDto;
import tdea.construccion2.app.dto.ClinicHistoryDto;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.PetsDto;
import tdea.construccion2.app.dto.SessionDto;
import tdea.construccion2.app.dto.UserDto;

@Service
public class VetService implements VeterinaryService,LoginService,SellerService,AdministratorService,OrderService{
	List<String> roles = Arrays.asList("Administrador","Vendedor","Medico veterinario");
	private static long sessionId = 0L;

	@Autowired
	private PersonDao personDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private PetsDao petsDao;
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private LoginDao loginDao;
	@Autowired
	private ClinicHistoryDao clinicHistoryDao;


	@Override
	public void createUser(UserDto userDto) throws Exception {
		if(!roles.contains(userDto.getRole())) {
			throw new Exception("El rol no es valido");
	}
		if (userDao.findUserExist(userDto)) {
			throw new Exception("ya existe un usuario con esa cedula");
	}

		if (userDao.existUserByUser(userDto)) {
			throw new Exception("ya existe el usuario");
	}
	
		userDao.createUser(userDto);
		System.out.println("se ha creado el usuario");
}

	
	@Override
	public void createPerson(PersonDto personDto) throws Exception {
		// TODO Auto-generated method stub
	
}

	@Override
	public void createPets(PetsDto petsDto) throws Exception {
		PetsDto petsDtoValidator = petsDao.findPetsByPets(petsDto);
		if (petsDtoValidator == null) {
			throw new Exception("id no valido");
	}
		if (!petsDto.getIdPerson().equals(petsDtoValidator.getIdPerson())) {
			throw new Exception("usuario no valido");
	}
		petsDao.createPets(petsDto);;
		System.out.println("se ha ingresado la mascota");
}


	@Override
	public void createOrder(OrderDto orderDto) throws Exception {
		orderDao.createOrder(orderDto);
		System.out.println("se ha creado el usuario");
}

	@Override
	public void login(UserDto userDto) throws Exception {
		UserDto userDtoValidator = userDao.findUserByUser(userDto);
		if (userDtoValidator == null) {
			throw new Exception("usuario no valido");
	}
		if (!userDto.getPassword().equals(userDtoValidator.getPassword())) {
			throw new Exception("usuario o contraseña incorrectos");
	}
		userDto.setRole(userDtoValidator.getRole());
		SessionDto sesionDto = loginDao.login(userDtoValidator);
		setSesionID(sesionDto.getId());
		System.out.println("se inicia la sesion " + sessionId);
	
}

	@Override
	public void logout() throws Exception {
		loginDao.logout(sessionId);
		setSesionID(0);
	
} 


	@Override
	public void createBills(BillsDto billsDto) throws Exception {
	
}


	@Override
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception {
	//paso 1 tomar al vet de la sesion

		SessionDto sessionDto = loginDao.findSessionById(sessionId);
		UserDto vetDto = new UserDto();
		vetDto.setUser(sessionDto.getUser());
			vetDto.setPersonName(personDao.findUser(vetDto));
	
	//paso validar mascota
		PetsDto petDto = petsDao.findPetsByPets(clinicHistoryDto.getPetDto());
		if (petDto ==null) {
		//disparar excepcion
			throw new Exception();
	}
	
	
	// crear orden
		OrderDto orderDto = clinicHistoryDto.getOrderId();
		orderDto.setIdOwner(petDto.getIdPerson());
		orderDto.setGenerationDate(new Date(clinicHistoryDto.getDate()));
		orderDto.setIdPet(petDto);
		orderDto.setIdVet(vetDto.getPersonName());
		orderDto.setMedicineName(clinicHistoryDto.getMedicines());
		this.createOrder(orderDto);
	
	//agregar orden a historia clinica
		clinicHistoryDto.setIdOrder(orderDto);
	//crear hitoria clinica
		clinicHistoryDto.setVeterinarian(clinicHistoryDto.getVeterinarian());
		clinicHistoryDto.setReasonForConsultation(clinicHistoryDto.getReasonForConsultation());
		clinicHistoryDto.setSymptomatology(clinicHistoryDto.getSymptomatology());
		clinicHistoryDto.setProcedures(clinicHistoryDto.getProcedures());
		clinicHistoryDto.setMedicines(clinicHistoryDto.getMedicines());
		clinicHistoryDto.setVaccinationHistory(clinicHistoryDto.getVaccinationHistory());
		clinicHistoryDto.setAllergies(clinicHistoryDto.getAllergies());
		clinicHistoryDto.setDetailedProcedure(clinicHistoryDto.getDetailedProcedure());
	//crear dao de historia clinica

	
	
}

	@Override
	public void setSesionID(long sesionId) {
	sessionId = sesionId;
	}


	public PersonDao getPersonDao() {
		return personDao;
	}


	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}


	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public PetsDao getPetsDao() {
		return petsDao;
	}


	public void setPetsDao(PetsDao petsDao) {
		this.petsDao = petsDao;
	}


	public OrderDao getOrderDao() {
		return orderDao;
	}


	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}


	public LoginDao getLoginDao() {
		return loginDao;
	}


	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}


	public ClinicHistoryDao getClinicHistoryDao() {
		return clinicHistoryDao;
	}


	public void setClinicHistoryDao(ClinicHistoryDao clinicHistoryDao) {
		this.clinicHistoryDao = clinicHistoryDao;
	}
	
	
}
