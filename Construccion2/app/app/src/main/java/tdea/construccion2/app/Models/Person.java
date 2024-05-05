package tdea.construccion2.app.Models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.PersonDto;

@Entity
@Table(name = "persona")
public class Person {
	@Id
	@Column(name="cedula")
	private long id;
	@Column(name="nombre")
	private String fullName;
	@Column(name="edad")
	private int age;
	
	public  Person(PersonDto personDto) {
		this.id=personDto.getId();
		this.fullName=personDto.getFullName();
		this.age=personDto.getAge();
	}
	
	public Person() {}
	
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
