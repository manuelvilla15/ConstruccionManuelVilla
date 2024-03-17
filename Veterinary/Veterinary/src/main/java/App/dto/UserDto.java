package App.dto;

public class UserDto {
	private String user;
	private String password;
	private String role;
	private PersonDto personName;

	public UserDto(PersonDto personName, String user, String password, String role) {
		super();
		this.user = user;
		this.password = password;
		this.role = role;
		this.personName = personName;
	}

	public UserDto() {
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
