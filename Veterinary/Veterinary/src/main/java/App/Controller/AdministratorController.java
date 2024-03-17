package App.Controller;

import java.util.Scanner;

import App.Service.AdministratorService;
import App.Service.VetService;
import App.Validator.PersonInputsValidator;
import App.Validator.UserInputsValidator;
import App.dto.PersonDto;
import App.dto.UserDto;

public class AdministratorController {
	private static PersonInputsValidator personInputValidator = new PersonInputsValidator();
	private static UserInputsValidator userInputValidator = new UserInputsValidator();
	private static Scanner reader = new Scanner(System.in);
	private static AdministratorService administratorService = new VetService();
	private static final String MENU = "ingrese\n1.Para crear usuario\n2.Para cerrar Sesion";
	
	public void createUser()throws Exception {
		System.out.println("Ingresa nombre completo");
		String fullName = reader.nextLine();
		userInputValidator.personNameValidator(fullName);
		PersonDto personDto = new PersonDto();
		personDto.setFullName(fullName);
		System.out.println("Ingresa numero de cedula");
		Long id = personInputValidator.idValidator(reader.nextLine());
		personDto.getId();
		System.out.println("Ingresa usuario");
		String user = reader.nextLine();
		userInputValidator.userValidator(user);
		System.out.println("Ingresa contraseña");
		String password = reader.nextLine();
		userInputValidator.passwordValidator(password);
		System.out.println("Ingresa su rol");
		String role = reader.nextLine();
		userInputValidator.roleValidator(role);
		UserDto userDto = new UserDto(personDto,user,password,role);
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


}
