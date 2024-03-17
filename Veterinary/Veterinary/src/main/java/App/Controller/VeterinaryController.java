package App.Controller;


import java.util.Scanner;

import App.Service.VetService;
import App.Service.VeterinaryService;
import App.Validator.ClinicHistoryInputsValidator;
import App.Validator.OrderInputsValidator;
import App.Validator.PersonInputsValidator;
import App.Validator.PetsInputsValidator;
import App.Validator.UserInputsValidator;
import App.dto.ClinicHistoryDto;
import App.dto.OrderDto;
import App.dto.PersonDto;
import App.dto.PetsDto;
import App.dto.UserDto;


public class VeterinaryController {
	private static PersonInputsValidator personInputValidator = new PersonInputsValidator();
	private static PetsInputsValidator petsInputValidator = new PetsInputsValidator();
	public static OrderInputsValidator orderInputValidator = new OrderInputsValidator();
	public static ClinicHistoryInputsValidator clinicHistoryInputsValidator = new ClinicHistoryInputsValidator();
	private static Scanner reader = new Scanner(System.in);
	private static VeterinaryService veterinaryService = new VetService();
	private static final String MENU = "ingrese \n1. Crear persona \n2.Para crear mascota\n3.Para crear historia clinica\n4.Para cerrar Sesion";
	
public void createOwner()throws Exception {
	System.out.println("Ingresa nombre completo");
	String fullName = reader.nextLine();
	personInputValidator.fullNameValidator(fullName);
	System.out.println("Ingresa id");
	long id = personInputValidator.idValidator(reader.nextLine());
	System.out.println("Ingresa edad");
	int age = personInputValidator.ageValidator(reader.nextLine());
	PersonDto personDto = new PersonDto(fullName, id, age); 
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
	System.out.println("Ingresa la fecha");
	Long date = clinicHistoryInputsValidator.dateValidator(reader.nextLine());
	System.out.println("Ingresa nombre medico veterinario");
	String veterinarian = reader.nextLine();
	PersonDto personDto = new PersonDto();
	personDto.setFullName(veterinarian);
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
	System.out.println("Ingresa id de orden");
	Long idOrder = clinicHistoryInputsValidator.idOrderValidator(reader.nextLine());
	OrderDto orderDto = new OrderDto();
	orderDto.setIdOrder(idOrder);
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



}