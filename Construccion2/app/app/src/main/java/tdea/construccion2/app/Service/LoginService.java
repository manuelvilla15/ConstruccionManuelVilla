package tdea.construccion2.app.Service;


import tdea.construccion2.app.dto.UserDto;

public interface LoginService {
	public void setSesionID(long sesionId);
	public void login(UserDto userDto)throws Exception;	
	public void logout() throws Exception;
}