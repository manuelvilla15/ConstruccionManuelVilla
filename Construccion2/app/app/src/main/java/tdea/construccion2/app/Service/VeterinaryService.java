package tdea.construccion2.app.Service;


import tdea.construccion2.app.dto.ClinicHistoryDto;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.PetsDto;

public interface VeterinaryService  {
	public void createPerson(PersonDto personDto) throws Exception;
	public void createPets(PetsDto petsDto) throws Exception;
	public void createOrder(OrderDto orderDto) throws Exception;
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;

	
	
}
