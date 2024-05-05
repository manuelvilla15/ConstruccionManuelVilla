package tdea.construccion2.app.Controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tdea.construccion2.app.Service.SellerService;
import tdea.construccion2.app.Validator.BillsInputsValidator;
import tdea.construccion2.app.Validator.UserInputsValidator;
import tdea.construccion2.app.dto.BillsDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.PetsDto;
import tdea.construccion2.app.dto.UserDto;

@Component
public class SellerController {
	@Autowired
	private  UserInputsValidator userInputValidator;
	@Autowired
	private  BillsInputsValidator billsInputsValidator;
	private static Scanner reader = new Scanner(System.in);
	@Autowired
	private  SellerService sellerService;
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
		UserDto userDto = new UserDto();
		
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

	public UserInputsValidator getUserInputValidator() {
		return userInputValidator;
	}

	public void setUserInputValidator(UserInputsValidator userInputValidator) {
		this.userInputValidator = userInputValidator;
	}

	public BillsInputsValidator getBillsInputsValidator() {
		return billsInputsValidator;
	}

	public void setBillsInputsValidator(BillsInputsValidator billsInputsValidator) {
		this.billsInputsValidator = billsInputsValidator;
	}

	public SellerService getSellerService() {
		return sellerService;
	}

	public void setSellerService(SellerService sellerService) {
		this.sellerService = sellerService;
	}

	
	

}
