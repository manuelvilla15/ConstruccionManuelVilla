package tdea.construccion2.app.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.UserDto;

@Entity
@Table(name = "usuario")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private int id;
	@Column(name = "user")
	private String user;
	@Column(name = "password")
	private String password;
	@Column(name = "role")
	private String role;
	@ManyToOne
	@JoinColumn(name = "cedula")
	private Person person;

	public User(UserDto userDto) {
		this.user = userDto.getUser();
		this.password = userDto.getPassword();
		this.role = userDto.getRole();

	}

	public User() {
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

}
