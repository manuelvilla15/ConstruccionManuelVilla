package App.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import App.Config.MYSQLConnection;
import App.dto.PersonDto;
import App.dto.UserDto;

public class PersonDaoImpl implements PersonDao, UserDao{
	public Connection connection = MYSQLConnection.getConnection();

	@Override
	public void createPerson(PersonDto personDto) throws Exception {
		String query = "INSERT INTO PERSONA(ID,FULLNAME,AGE) VALUES (?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i = 1;
		preparedStatement.setLong(i++, personDto.getId());
		preparedStatement.setString(i++, personDto.getFullName());
		preparedStatement.setInt(i++, personDto.getAge());
		preparedStatement.execute();
		preparedStatement.close();
	}

	@Override
	public void createUser(UserDto userDto) throws Exception {
		//String query = "INSERT INTO PERSON(USER, PASSWORD, ROLE) VALUES (?,?,?,?,?)";
		String query = "UPDATE PERSONA SET USER=?,PASSWORD=?,ROLE=? WHERE ID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i = 1;
		preparedStatement.setString(i++, userDto.getUser());
		preparedStatement.setString(i++, userDto.getPassword());
		preparedStatement.setString(i++, userDto.getRole());
		preparedStatement.setLong(i++, userDto.getPersonName().getId());
		preparedStatement.execute();
		preparedStatement.close();
		
	}

	@Override
	public boolean findUserExist(PersonDto personDto) throws Exception {
		String query = "SELECT 1 FROM PERSONA WHERE ID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setLong(1, personDto.getId());
		ResultSet resulSet = preparedStatement.executeQuery();
		boolean userExists = resulSet.next();
		resulSet.close();
		preparedStatement.close();
		return userExists;
	}


	@Override
	public PersonDto findUser(UserDto userDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existUserByUser(UserDto userDto) throws Exception {
		String query = "SELECT 1 FROM PERSONA WHERE USER = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, userDto.getUser());
		ResultSet resulSet = preparedStatement.executeQuery();
		boolean userExists = resulSet.next();
		resulSet.close();
		preparedStatement.close();
		return userExists;
	}

	@Override
	public UserDto findUserByUser(UserDto userDto) throws Exception {
		return null;
		
	}

	@Override
	public PersonDto findUserById(PersonDto personDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonDto findUserByUser(PersonDto personDto) throws Exception {
		// TODO Auto-generated method stub
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
	
}

