package tdea.construccion2.app.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.SessionDto;

@Entity
@Table(name="sesion")
public class Session {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="username")
	private String user;
	@Column(name="role")
	private String role;

	public Session(SessionDto sessionDto) {
		this.id=sessionDto.getId();
		this.user=sessionDto.getUser();
		this.role=sessionDto.getRole();
	}

	public Session() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	} 
	

}
