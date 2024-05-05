package tdea.construccion2.app.Service;

import tdea.construccion2.app.dto.BillsDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.UserDto;

public interface SellerService {
	public void createUser(UserDto userDto) throws Exception;
	public void createPerson(PersonDto personDto) throws Exception;
	public void createBills(BillsDto billsDto) throws Exception;
}