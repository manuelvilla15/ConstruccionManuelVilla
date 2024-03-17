package App.Models;

public class User {
	private String user;
	private String password;
	private String role;
	private Person personName;
	
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
	public Person getPersonName() {
		return personName;
	}
	public void setPersonName(Person personName) {
		this.personName = personName;
	}

}
