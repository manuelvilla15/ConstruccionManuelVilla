package App.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import App.Config.MYSQLConnection;
import App.dto.SessionDto;
import App.dto.UserDto;

public class LoginDaoImpl implements LoginDao{
	public Connection connection = MYSQLConnection.getConnection();

	@Override
	public SessionDto login(UserDto userDto) throws Exception {
		String query = "INSERT INTO SESION(USERROLL,USERNAME) VALUES (?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i = 1;
		
		preparedStatement.setString(i++, userDto.getUser());
		preparedStatement.setString(i++, userDto.getRole());
		preparedStatement.execute();
		query = "SELECT ID,ROLE,USER FROM SESION WHERE USER = ?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, userDto.getUser());
		ResultSet resulSet = preparedStatement.executeQuery();
		if (resulSet.next()) {
			long id = resulSet.getLong("ID");
			String role = resulSet.getString("ROLE");
			String user = resulSet.getString("USER");
			resulSet.close();
			preparedStatement.close();
			return new SessionDto(id, user, role);
		}
		resulSet.close();
		preparedStatement.close();
		return null;
	}

	@Override
	public SessionDto findSessionById(long sessionId) throws Exception {
		String query = "SELECT ID,ROLE,USER FROM SESION WHERE ID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setLong(1, sessionId);
		ResultSet resulSet = preparedStatement.executeQuery();
		if (resulSet.next()) {
			long id = resulSet.getLong("ID");
			String role = resulSet.getString("ROLE");
			String user = resulSet.getString("USER");
			resulSet.close();
			preparedStatement.close();
			return new SessionDto(id, user, role);
		}
		resulSet.close();
		preparedStatement.close();
		return null;
	}

	@Override
	public void logout(long sessionId) throws Exception {
		String query = "DELETE FROM SESION WHERE ID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setLong(1, sessionId);
		preparedStatement.execute();
		preparedStatement.close();
		
	}


	
}
