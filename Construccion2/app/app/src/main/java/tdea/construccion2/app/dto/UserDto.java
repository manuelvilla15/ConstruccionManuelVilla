package tdea.construccion2.app.dto;

import tdea.construccion2.app.Models.User;

public class UserDto {
	private String user;
	private String password;
	private String role;
	private PersonDto personName;
	
		
	public UserDto(String user, String password, String role, PersonDto personName) {
		super();
		this.user = user;
		this.password = password;
		this.role = role;
		this.personName = personName;
	}


	public UserDto() {
		super();
	}

	public UserDto(User user) {
		this.user = user.getUser();
		this.password = user.getPassword();
		this.role = user.getRole();
		
		
	} 

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public PersonDto getPersonName() {
		return personName;
	}

	public void setPersonName(PersonDto personName) {
		this.personName = personName;
	}

	

}
