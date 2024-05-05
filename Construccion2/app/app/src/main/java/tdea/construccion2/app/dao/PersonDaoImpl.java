package tdea.construccion2.app.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdea.construccion2.app.Models.Person;
import tdea.construccion2.app.Models.User;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.UserDto;
import tdea.construccion2.app.repository.PersonRepository;
import tdea.construccion2.app.repository.UserRepository;

@Service
public class PersonDaoImpl implements PersonDao, UserDao{
	@Autowired
	private UserRepository userRepository;
	private PersonRepository personRepository;
	
	@Override
	public void createPerson(PersonDto personDto) throws Exception {
		Person person = new Person(personDto);
		person.setId (personDto.getId());
		person.setAge(personDto.getAge());
		person.setFullName(personDto.getFullName());
		personRepository.save(person);
	}

	@Override
	public void createUser(UserDto userDto) throws Exception {
		User user = new User(userDto);
		userRepository.save(user);
	}

	@Override
	public boolean findUserExist(PersonDto personDto) throws Exception {
		return personRepository.existsById(personDto.getId());
	}


	@Override
	public PersonDto findUser(UserDto userDto) throws Exception {
		
		return null;
	}

	@Override
	public boolean existUserByUser(UserDto userDto) throws Exception {
		return userRepository.existsByUser(userDto.getUser());
	}

	@Override
	public UserDto findUserByUser(UserDto userDto) throws Exception {
		User user = userRepository.findByUser(userDto.getUser());
		if(user==null) {
		return null;
		}
		return new UserDto(user);
	}

	@Override
	public PersonDto findUserById(PersonDto personDto) throws Exception {
		Person person = personRepository.findById(personDto.getId());
		if(person==null) {
		return null;
		}
		return new PersonDto(person);
	}

	@Override
	public PersonDto findUserByUser(PersonDto personDto) throws Exception {
		
		return null;
	}

	@Override
	public boolean findUserExist(UserDto userDto) throws Exception {
		return this.findUserExist(userDto.getPersonName());
	}

	@Override
	public void createPerson(UserDto userDto) throws Exception {
		this.createPerson(userDto.getPersonName());
		
	}

	@Override
	public boolean existUserByUser(PersonDto personDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public PersonRepository getPersonRepository() {
		return personRepository;
	}

	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public boolean existsById(PersonDto personDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person findById(PersonDto personDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

