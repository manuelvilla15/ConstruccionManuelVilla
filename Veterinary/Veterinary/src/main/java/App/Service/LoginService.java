package App.Service;


import App.dto.UserDto;

public interface LoginService {
	public void setSesionID(long sesionId);
	public void login(UserDto userDto)throws Exception;	
	public void logout() throws Exception;
}