package tdea.construccion2.app.dto;

import tdea.construccion2.app.Models.Session;

public class SessionDto {
	private long id;
	private String user;
	private String role;

	public SessionDto(Session session) {
		super();
		this.id = session.getId();
		this.user = session.getUser();
		this.role = session.getRole();
	
	}

	public SessionDto() {
		super();
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
