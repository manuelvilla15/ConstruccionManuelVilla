package tdea.construccion2.app.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.PetsDto;

@Entity
@Table(name="mascota")
public class Pets {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long idPets;
	@Column(name="nombre")
	private String namePets;
	@ManyToOne
	@JoinColumn(name="propetario")
	private Person idPerson;
	@Column(name="edad")
	private int agePets;
	@Column(name="especie")
	private String species;
	@Column(name="raza")
	private String race;
	@Column(name="caracteristicas")
	private String characteristic;
	@Column(name="peso")
	private double weight;
	
	
	
	public Pets(PetsDto petsDto) {
		this.namePets=petsDto.getNamePets();
		this.idPerson=new Person(petsDto.getIdPerson());
		this.agePets=petsDto.getAgePets();
		this.idPets=petsDto.getIdPets();
		this.species=petsDto.getSpecies();
		this.race=petsDto.getRace();
		this.characteristic=petsDto.getCharacteristic();
		this.weight=petsDto.getWeight();
		
	} 
	public Pets() {}
	
	public String getNamePets() {
		return namePets; 
	}
	public void setNamePets(String namePets) {
		this.namePets = namePets;
	}
	public Person getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(Person idPerson) {
		this.idPerson = idPerson;
	}
	public int getAgePets() {
		return agePets;
	}
	public void setAgePets(int agePets) {
		this.agePets = agePets;
	}
	public long getIdPets() {
		return idPets;
	}
	public void setIdPets(long idPets) {
		this.idPets = idPets;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getCharacteristic() {
		return characteristic;
	}
	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
