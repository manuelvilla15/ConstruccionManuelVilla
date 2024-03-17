package App.dao;

import App.dto.PersonDto;
import App.dto.UserDto;

public interface UserDao {
	public void createUser(UserDto userDto) throws Exception;
	public void createPerson(UserDto userDto) throws Exception;
	public boolean findUserExist(UserDto userDto)throws Exception;
	public PersonDto findUser(UserDto userDto) throws Exception;
	public boolean existUserByUser(UserDto userDto) throws Exception;
	public UserDto findUserByUser(UserDto userDto) throws Exception;
	


}
