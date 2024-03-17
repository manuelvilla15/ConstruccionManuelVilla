package App.dao;

import App.dto.PersonDto;
import App.dto.UserDto;

public interface PersonDao {
	public void createPerson(PersonDto personDto) throws Exception;
	public boolean findUserExist(PersonDto personDto)throws Exception;
	public PersonDto findUserById(PersonDto personDto) throws Exception;
	public boolean existUserByUser(PersonDto personDto) throws Exception;
	public PersonDto findUserByUser(PersonDto personDto) throws Exception;
	PersonDto findUser(UserDto userDto) throws Exception;
	
	
	

}
