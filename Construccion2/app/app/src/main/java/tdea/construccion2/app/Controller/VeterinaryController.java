package tdea.construccion2.app.Controller;


import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tdea.construccion2.app.Service.VeterinaryService;
import tdea.construccion2.app.Validator.ClinicHistoryInputsValidator;
import tdea.construccion2.app.Validator.OrderInputsValidator;
import tdea.construccion2.app.Validator.PersonInputsValidator;
import tdea.construccion2.app.Validator.PetsInputsValidator;
import tdea.construccion2.app.dto.ClinicHistoryDto;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.PetsDto;


@Component
public class VeterinaryController {
	@Autowired
	private  PersonInputsValidator personInputValidator;
	@Autowired
	private  PetsInputsValidator petsInputValidator;
	@Autowired
	public  OrderInputsValidator orderInputValidator;
	@Autowired
	public  ClinicHistoryInputsValidator clinicHistoryInputsValidator;
	private static Scanner reader = new Scanner(System.in);
	@Autowired
	private  VeterinaryService veterinaryService;
	private static final String MENU = "ingrese \n1. Crear persona \n2.Para crear mascota \n3.Para crear historia clinica \n4.Para cerrar Sesion";
	
public void createOwner() throws Exception {
	    System.out.println("Ingresa nombre completo:");
	    String fullName = reader.nextLine();
	    personInputValidator.fullNameValidator(fullName);
	    
	    System.out.println("Ingresa ID:");
	    long id = personInputValidator.idValidator(reader.nextLine());
	    
	    System.out.println("Ingresa edad:");
	    int age = personInputValidator.ageValidator(reader.nextLine());
	    
	    PersonDto personDto = new PersonDto();
	    personDto.setFullName(fullName);
	    personDto.setAge(age);
	    personDto.setId(id);
	    
	    veterinaryService.createPerson(personDto); 
}


public void createPets() throws Exception {
	System.out.println("Ingresa el nombre de la mascota");
	String namePets = reader.nextLine();
	petsInputValidator.namePetsValidator(namePets);
	
	System.out.println("Ingresa Id del dueño");
	Long idPerson = petsInputValidator.idPersonValidator(reader.nextLine());
	PersonDto personDto = new PersonDto();
	personDto.setId(idPerson);
	
	System.out.println("Ingresa la edad de la mascota");
	int agePets = petsInputValidator.agePetsValidator(reader.nextLine());
	
	System.out.println("Ingresa el tipo de especie de mascota");
	String species = reader.nextLine();
	petsInputValidator.speciesValidator(species);
	System.out.println("Ingresa el tipo de raza de mascota");
	String race = reader.nextLine();
	petsInputValidator.raceValidator(race);
	System.out.println("Ingresa las caracteristicas de la mascota");
	String characteristic = reader.nextLine();
	petsInputValidator.characteristicValidator(characteristic);
	System.out.println("Ingresa el peso de la mascota");
	Double weight = petsInputValidator.weightValidator(reader.nextLine());
	PetsDto petsDto = new PetsDto(namePets, personDto, agePets, species, race, characteristic, weight);
	System.out.println("Se cumplieron todas las validaciones");
	veterinaryService.createPets(petsDto);		
}
public void createClinicHistory() throws Exception {
	//System.out.println("Ingresa la fecha");
	Long date = System.currentTimeMillis();
	System.out.println("Ingresa nombre medico veterinario");
	String veterinarian = reader.nextLine();
	PersonDto personDto = new PersonDto();
	personDto.setFullName(veterinarian);
	System.out.println("ingrese el id de la mascota");
	long petid =petsInputValidator.idPetsValidator(reader.nextLine());
	PetsDto petDto= new PetsDto();
	petDto.setIdPets(petid);
	clinicHistoryInputsValidator.veterinarianValidator(veterinarian);
	System.out.println("Mostrar consulta");
	String reasonForConsultation = reader.nextLine();
	clinicHistoryInputsValidator.reasonForConsultationValidator(reasonForConsultation);
	System.out.println("Ingresa la sintomatologia");
	String symptomatology = reader.nextLine();
	clinicHistoryInputsValidator.symptomatologyValidator(symptomatology);
	System.out.println("Ingresa la sintomatologia");
	String procedures = reader.nextLine();
	clinicHistoryInputsValidator.proceduresValidator(procedures);
	System.out.println("Ingresa medicamentos");
	String medicines = reader.nextLine();
	clinicHistoryInputsValidator.medicinesValidator(medicines);
	//System.out.println("Ingresa id de orden");
	//Long idOrder = clinicHistoryInputsValidator.idOrderValidator(reader.nextLine());
	OrderDto orderDto = new OrderDto();
	//orderDto.setIdOrder(idOrder);
	System.out.println("Ingresa la historia de vacunacion");
	String vaccinationHistory = reader.nextLine();
	clinicHistoryInputsValidator.vaccinationHistoryValidator(vaccinationHistory);
	System.out.println("Alergia");
	String allergies = reader.nextLine();
	clinicHistoryInputsValidator.allergiesValidator(allergies);
	System.out.println("Ingresa los detalles del procedimiento");
	String detailedProcedure = reader.nextLine();
	clinicHistoryInputsValidator.detailedProcedureValidator(detailedProcedure);
	ClinicHistoryDto clinicHistoryDto = new ClinicHistoryDto(date,personDto,reasonForConsultation,symptomatology,procedures,medicines,orderDto,vaccinationHistory,allergies,detailedProcedure);
	clinicHistoryDto.setPetDto(petDto);
	System.out.println("Se cumplieron todas las validaciones");
	veterinaryService.createClinicHistory(clinicHistoryDto);
}
public void session() {
	boolean runApp = true;
	while (runApp) {
		try {
			System.out.println(MENU);
			String option = reader.nextLine();
			runApp=menu(option);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

private boolean menu(String option) throws Exception{
	switch (option) {
	case "1": {
		createOwner();
		return true;
	}
	case "2":{
		createPets();
		return true;
	}
	case "3": {
		createClinicHistory();
		return true;
	}
	case "4": {
		return false;
	}
	default :{
		System.out.println("ingrese una opcion valida");
		return true;
	}
	}
}

public PersonInputsValidator getPersonInputValidator() {
	return personInputValidator;
}

public void setPersonInputValidator(PersonInputsValidator personInputValidator) {
	this.personInputValidator = personInputValidator;
}

public PetsInputsValidator getPetsInputValidator() {
	return petsInputValidator;
}

public void setPetsInputValidator(PetsInputsValidator petsInputValidator) {
	this.petsInputValidator = petsInputValidator;
}

public OrderInputsValidator getOrderInputValidator() {
	return orderInputValidator;
}

public void setOrderInputValidator(OrderInputsValidator orderInputValidator) {
	this.orderInputValidator = orderInputValidator;
}

public ClinicHistoryInputsValidator getClinicHistoryInputsValidator() {
	return clinicHistoryInputsValidator;
}

public void setClinicHistoryInputsValidator(ClinicHistoryInputsValidator clinicHistoryInputsValidator) {
	this.clinicHistoryInputsValidator = clinicHistoryInputsValidator;
}

public VeterinaryService getVeterinaryService() {
	return veterinaryService;
}

public void setVeterinaryService(VeterinaryService veterinaryService) {
	this.veterinaryService = veterinaryService;
}



}