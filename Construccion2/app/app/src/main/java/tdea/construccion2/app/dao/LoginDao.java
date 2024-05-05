package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.SessionDto;
import tdea.construccion2.app.dto.UserDto;

public interface LoginDao {
	public SessionDto login(UserDto userDto) throws Exception;
	public SessionDto findSessionById(long sessionId) throws Exception;
	public void logout(long sessionId) throws Exception;

}
