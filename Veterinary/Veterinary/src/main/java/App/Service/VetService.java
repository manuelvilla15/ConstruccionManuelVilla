package App.Service;

import java.util.Arrays;
import java.util.List;

import App.dao.LoginDao;
import App.dao.LoginDaoImpl;
import App.dao.OrderDao;
import App.dao.OrderDaoImpl;
import App.dao.PersonDaoImpl;
import App.dao.PetsDao;
import App.dao.PetsDaoImpl;
import App.dao.UserDao;
import App.dto.BillsDto;
import App.dto.ClinicHistoryDto;
import App.dto.OrderDto;
import App.dto.PersonDto;
import App.dto.PetsDto;
import App.dto.SessionDto;
import App.dto.UserDto;

public class VetService implements VeterinaryService,LoginService,SellerService,AdministratorService,OrderService{
private static final String[] role = {"Administrador","Vendedor","Medico veterinario"};
private static long sessionId = 0L;



@Override
public void createUser(UserDto userDto) throws Exception {
	List<String> rols = Arrays.asList(role);
	if(!rols.contains(userDto.getRole())) {
		throw new Exception("El rol no es valido");
	}
	UserDao userDao = new PersonDaoImpl();
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
	PetsDao petsDao = new PetsDaoImpl();
	petsDao.createPets(petsDto);
	System.out.println("se ha creado la mascota");
	}

@Override
public void createOrder(OrderDto orderDto) throws Exception {
	OrderDao orderDao = new OrderDaoImpl();
	orderDao.createOrder(orderDto);
	System.out.println("se ha creado la orden");
}

@Override
public void login(UserDto userDto) throws Exception {
	UserDao userDao = new PersonDaoImpl();
	UserDto userDtoValidator = userDao.findUserByUser(userDto);
	if (userDtoValidator == null) {
		throw new Exception("usuario no valido");
	}
	if (!userDto.getPassword().equals(userDtoValidator.getPassword())) {
		throw new Exception("usuario o contraseña incorrectos");
	}
	userDto.setRole(userDtoValidator.getRole());
	LoginDao loginDao = new LoginDaoImpl();
	SessionDto sesionDto = loginDao.login(userDtoValidator);
	setSesionID(sesionDto.getId());
	System.out.println("se inicia la sesion " + sessionId);
	
}

@Override
public void logout() throws Exception {
	LoginDao loginDao = new LoginDaoImpl();
	loginDao.logout(sessionId);
	setSesionID(0);
	
}


@Override
public void createBills(BillsDto billsDto) throws Exception {
	// TODO Auto-generated method stub
	
}


@Override
public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception {
	// TODO Auto-generated method stub
	
}

@Override
public void setSesionID(long sesionId) {
	sessionId = sesionId;
}





}
