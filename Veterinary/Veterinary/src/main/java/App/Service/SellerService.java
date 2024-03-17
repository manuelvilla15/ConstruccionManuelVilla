package App.Service;

import App.dto.BillsDto;
import App.dto.PersonDto;
import App.dto.UserDto;

public interface SellerService {
	public void createUser(UserDto userDto) throws Exception;
	public void createPerson(PersonDto personDto) throws Exception;
	public void createBills(BillsDto billsDto) throws Exception;
}