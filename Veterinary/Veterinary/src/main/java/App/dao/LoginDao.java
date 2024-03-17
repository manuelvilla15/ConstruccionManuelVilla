package App.dao;

import App.dto.SessionDto;
import App.dto.UserDto;

public interface LoginDao {
	public SessionDto login(UserDto userDto) throws Exception;
	public SessionDto findSessionById(long sessionId) throws Exception;
	public void logout(long sessionId) throws Exception;

}
