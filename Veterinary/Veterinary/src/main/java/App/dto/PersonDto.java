package App.dto;

import App.Models.Person;

public class PersonDto {
	private long id;
	private String fullName;
	private int age;
	
	
	public PersonDto( String fullName,long id, int age) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.age = age;
	}

	public PersonDto() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 


}
