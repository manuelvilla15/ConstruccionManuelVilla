package App.Service;


import App.dto.ClinicHistoryDto;
import App.dto.OrderDto;
import App.dto.PersonDto;
import App.dto.PetsDto;
import App.dto.UserDto;

public interface VeterinaryService  {
	public void createPerson(PersonDto personDto) throws Exception;
	public void createPets(PetsDto petsDto) throws Exception;
	public void createOrder(OrderDto orderDto) throws Exception;
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;

	
	
}
