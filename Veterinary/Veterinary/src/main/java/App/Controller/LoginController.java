package App.Controller;

import java.util.Scanner;

import App.Service.LoginService;
import App.Service.VetService;
import App.Validator.UserInputsValidator;
import App.dto.UserDto;

public class LoginController {
	private static Scanner reader = new Scanner(System.in);
	private static UserInputsValidator userInputValidator = new UserInputsValidator();
	private static LoginService loginService = new VetService();
	private static VeterinaryController veterinaryController = new VeterinaryController();
	private static SellerController sellerController = new SellerController();
	private static AdministratorController administratorController = new AdministratorController();
	


	public void login() throws Exception {
		System.out.println("ingrese su usuario");
		String user = reader.nextLine();
		userInputValidator.userValidator(user);
		System.out.println("ingrese su contraseña");
		String password = reader.nextLine();
		userInputValidator.passwordValidator(password);
		System.out.println("Ingresa rol");
		String role = reader.nextLine();
		userInputValidator.roleValidator(role);
		UserDto userDto = new UserDto(null,user, password, role);
		loginService.login(userDto);
		loginRouter(userDto);
		loginService.logout();
	}

	private void loginRouter(UserDto userDto) {
		if (userDto.getRole().equals("Medico Veterinario")) {
			veterinaryController.session();
		}else if (userDto.getRole().equals("Vendedor")) {
			sellerController.session();
		}else if (userDto.getRole().equals("Administrador")) {
			administratorController.session();	
		}
	}
}	
