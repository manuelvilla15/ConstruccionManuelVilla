package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.UserDto;

public interface UserDao {
	public void createUser(UserDto userDto) throws Exception;
	public void createPerson(UserDto userDto) throws Exception;
	public boolean findUserExist(UserDto userDto)throws Exception;
	public PersonDto findUser(UserDto userDto) throws Exception;
	public boolean existUserByUser(UserDto userDto) throws Exception;
	public UserDto findUserByUser(UserDto userDto) throws Exception;
	

}
