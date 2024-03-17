package App.Service;

import App.dto.PersonDto;
import App.dto.UserDto;

public interface AdministratorService {
	public void createUser(UserDto userDto) throws Exception;
	public void createPerson(PersonDto personDto) throws Exception;
	void logout() throws Exception;

}
