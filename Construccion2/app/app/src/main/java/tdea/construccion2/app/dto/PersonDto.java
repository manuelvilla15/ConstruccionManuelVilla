package tdea.construccion2.app.dto;

import tdea.construccion2.app.Models.Person;

public class PersonDto {
	private long id;
	private String fullName;
	private int age;
	
	
	public PersonDto(long id, String fullName, int age) {
		super();
		this.id = id;
		this.fullName = fullName; 
		this.age = age;
	}
	

	public PersonDto() {
		super();
	}

	public PersonDto(Person person) {
		this.id = person.getId();
		this.fullName = person.getFullName();
		this.age = person.getAge();
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
