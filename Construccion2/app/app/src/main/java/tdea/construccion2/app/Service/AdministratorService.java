package tdea.construccion2.app.Service;

import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.UserDto;

public interface AdministratorService {
	public void createUser(UserDto userDto) throws Exception;
	public void createPerson(PersonDto personDto) throws Exception;
	void logout() throws Exception;

}
