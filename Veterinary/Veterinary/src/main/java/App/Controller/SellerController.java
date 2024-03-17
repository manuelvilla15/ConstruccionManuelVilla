package App.Controller;

import java.util.Scanner;

import App.Service.SellerService;
import App.Service.VetService;
import App.Validator.BillsInputsValidator;
import App.Validator.UserInputsValidator;
import App.dto.BillsDto;
import App.dto.PersonDto;
import App.dto.PetsDto;
import App.dto.UserDto;


public class SellerController {
	private static UserInputsValidator userInputValidator = new UserInputsValidator();
	private static BillsInputsValidator billsInputsValidator = new BillsInputsValidator();
	private static Scanner reader = new Scanner(System.in);
	private static SellerService sellerService = new VetService();
	private static final String MENU = "ingrese\n1.Para crear usuario\n2.Para crear factura\n3.Para cerrar Sesion";

	public void createUser()throws Exception {
		System.out.println("Ingresa nombre completo");
		String fullName = reader.nextLine();
		userInputValidator.personNameValidator(fullName);
		PersonDto personDto = new PersonDto();
		personDto.getFullName();
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
		sellerService.createUser(userDto); 
	}
	
	public void createBills() throws Exception {
		System.out.println("Ingresa el id de la factura");
		Long idBills = billsInputsValidator.idBillsValidator(reader.nextLine());
		System.out.println("Ingresa el id de la mascota");
		long idPet = billsInputsValidator.idBillsValidator(reader.nextLine());
		PetsDto petsDto = new PetsDto();
		petsDto.setIdPets(idPet);
		System.out.println("Ingresa el id del dueño");
		Long idPerson = billsInputsValidator.idBillsValidator(reader.nextLine());
		PersonDto personDto = new PersonDto();
		personDto.setId(idPerson);
		System.out.println("Ingresa el nombre del producto");
		String productName = reader.nextLine();
		billsInputsValidator.productNameValidator(productName);
		System.out.println("Ingresa el valor del producto");
		Double worth = billsInputsValidator.worthValidator(reader.nextLine());
		System.out.println("Ingresa el id del dueño");
		int amount = billsInputsValidator.amountValidator(reader.nextLine());
		System.out.println("Ingresa la fecha");
		BillsDto billsDto = new BillsDto(idBills,petsDto,personDto,productName,worth,amount);
		System.out.println("Se cumplieron todas las validaciones");
		sellerService.createBills(billsDto);
		
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
			createBills();
			return true;
		}
		case "3": {
			return false;
		}
		default :{
			System.out.println("ingrese una opcion valida");
			return true;
			}
		}
	}

}
