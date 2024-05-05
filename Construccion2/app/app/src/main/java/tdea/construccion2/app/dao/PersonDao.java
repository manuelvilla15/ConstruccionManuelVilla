package tdea.construccion2.app.dao;

import tdea.construccion2.app.Models.Person;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.UserDto;

public interface PersonDao {
	public void createPerson(PersonDto personDto) throws Exception;
	public boolean findUserExist(PersonDto personDto)throws Exception;
	public PersonDto findUserById(PersonDto personDto) throws Exception;
	public boolean existUserByUser(PersonDto personDto) throws Exception;
	public PersonDto findUserByUser(PersonDto personDto) throws Exception;
	PersonDto findUser(UserDto userDto) throws Exception;
	public boolean existsById(PersonDto personDto)throws Exception;
	public Person findById(PersonDto personDto)throws Exception;

}
