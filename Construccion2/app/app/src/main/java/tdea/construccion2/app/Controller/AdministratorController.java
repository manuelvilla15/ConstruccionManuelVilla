package tdea.construccion2.app.Controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tdea.construccion2.app.Service.AdministratorService;
import tdea.construccion2.app.Validator.PersonInputsValidator;
import tdea.construccion2.app.Validator.UserInputsValidator;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.UserDto;

@Component
public class AdministratorController {
	@Autowired
	private  PersonInputsValidator personInputValidator;
	@Autowired
	private  UserInputsValidator userInputValidator;
	private static Scanner reader = new Scanner(System.in);
	@Autowired
	private  AdministratorService administratorService;
	private static final String MENU = "ingrese\n1.Para crear usuario\n2.Para cerrar Sesion";
	
	public void createUser()throws Exception {
		System.out.println("Ingresa nombre completo");
		String fullName = reader.nextLine();
		userInputValidator.personNameValidator(fullName);
		PersonDto personDto = new PersonDto(null);
		personDto.setFullName(fullName);
		
		System.out.println("Ingresa numero de cedula");
		Long id = personInputValidator.idValidator(reader.nextLine());
		personDto.setId(id);
		
		System.out.println("Ingresa usuario");
		String user = reader.nextLine();
		userInputValidator.userValidator(user);
		
		System.out.println("Ingresa contraseña");
		String password = reader.nextLine();
		userInputValidator.passwordValidator(password);
		
		System.out.println("Ingresa su rol");
		String role = reader.nextLine();
		userInputValidator.roleValidator(role);
		UserDto userDto = new UserDto();
		
		System.out.println("Se cumplieron todas las validaciones");
		administratorService.createUser(userDto);
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
		case "1":{
			createUser();
			return true;
		}
		
		case "2": {
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
	public UserInputsValidator getUserInputValidator() {
		return userInputValidator;
	}
	public void setUserInputValidator(UserInputsValidator userInputValidator) {
		this.userInputValidator = userInputValidator;
	}
	public AdministratorService getAdministratorService() {
		return administratorService;
	}
	public void setAdministratorService(AdministratorService administratorService) {
		this.administratorService = administratorService;
	}


	
}
