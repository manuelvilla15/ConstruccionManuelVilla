package tdea.construccion2.app.Controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tdea.construccion2.app.Service.LoginService;
import tdea.construccion2.app.Validator.UserInputsValidator;
import tdea.construccion2.app.dto.UserDto;
@Component
public class LoginController {
	private static Scanner reader = new Scanner(System.in);
	@Autowired
	private  UserInputsValidator userInputValidator;
	@Autowired
	private  LoginService loginService;
	@Autowired
	private  VeterinaryController veterinaryController;
	@Autowired
	private  SellerController sellerController;
	@Autowired
	private  AdministratorController administratorController;

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
		UserDto userDto = new UserDto();
		userDto.setUser(user);
		userDto.setPassword(password);
		loginService.login(userDto);
		loginRouter(userDto);
		loginService.logout();
	}

	private void loginRouter(UserDto userDto) {
		if (userDto.getRole().equals("Medico veterinario")) {
			veterinaryController.session();
		}else if (userDto.getRole().equals("Vendedor")) {
			sellerController.session();
		}else if (userDto.getRole().equals("Administrador")) {
			administratorController.session();	
		}
	}

	public UserInputsValidator getUserInputValidator() {
		return userInputValidator;
	}

	public void setUserInputValidator(UserInputsValidator userInputValidator) {
		this.userInputValidator = userInputValidator;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public VeterinaryController getVeterinaryController() {
		return veterinaryController;
	}

	public void setVeterinaryController(VeterinaryController veterinaryController) {
		this.veterinaryController = veterinaryController;
	}

	public SellerController getSellerController() {
		return sellerController;
	}

	public void setSellerController(SellerController sellerController) {
		this.sellerController = sellerController;
	}

	public AdministratorController getAdministratorController() {
		return administratorController;
	}

	public void setAdministratorController(AdministratorController administratorController) {
		this.administratorController = administratorController;
	}
	
}	
