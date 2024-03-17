package App.Controller;

import java.sql.Date;
import java.util.Scanner;

import App.Service.OrderService;
import App.Service.VetService;
import App.Validator.OrderInputsValidator;
import App.dto.OrderDto;
import App.dto.PersonDto;
import App.dto.PetsDto;

public class OrderController {
	public static OrderInputsValidator orderInputsValidator = new OrderInputsValidator();
	private static Scanner reader = new Scanner(System.in);
	private static OrderService orderService = new VetService();
	private static final String MENU = "ingrese\n1.Para crear orden \n3.Para cerrar Sesion";
	
	public void createOrder() throws Exception {
		System.out.println("Ingresa el Id de la orden");
		Long idOrder = orderInputsValidator.idOrderValidator(reader.nextLine());
		System.out.println("Ingresa el Id de la mascota");
		Long idPet = orderInputsValidator.idPetValidator(reader.nextLine());
		PetsDto petsDto = new PetsDto();
		petsDto.setIdPets(idPet);
		System.out.println("Ingresa el Id del dueño");
		Long idOwner = orderInputsValidator.idOwnerValidator(reader.nextLine());
		PersonDto personDto = new PersonDto();
		personDto.setId(idOwner);
		System.out.println("Ingresa el Id del veterinario");
		Long idVet = orderInputsValidator.idVetValidator(reader.nextLine());
		personDto.setId(idVet);
		System.out.println("Ingresa el nombre del medicamento");
		String medicineName = reader.nextLine();
		orderInputsValidator.medicineNameValidator(medicineName);
		System.out.println("Ingresa la fecha de generacion");
		Date generationDate = orderInputsValidator.generationDateValidator(reader.nextLine());
		OrderDto orderDto = new OrderDto(idOrder,petsDto,personDto,personDto,medicineName);
		System.out.println("Se cumplieron todas las validaciones");
		orderService.createOrder(orderDto);
			
	}
	public void deleteOrder() throws Exception {
		System.out.println("Ingrese el id de la orden");
		Long idOrder = orderInputsValidator.idOrderValidator(reader.nextLine());
		OrderDto orderDto = new OrderDto(idOrder, null, null, null, null);
		orderDto.setIdOrder(idOrder);
		orderService.createOrder(orderDto);
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
			createOrder();
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

