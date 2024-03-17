package App.Models;

public class Pets {
	private String namePets;
	private Person idPerson;
	private int agePets;
	private long idPets;
	private String species;
	private String race;
	private String characteristic;
	private double weight;
	
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
