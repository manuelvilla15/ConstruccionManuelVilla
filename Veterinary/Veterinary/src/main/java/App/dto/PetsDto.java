package App.dto;

public class PetsDto {
	private String namePets;
	private PersonDto idPerson;
	private int agePets;
	private long idPets;
	private String species;
	private String race;
	private String characteristic;
	private double weight;
	
	
	public PetsDto(String namePets, PersonDto idPerson, int agePets, String species, String race,
			String characteristic, double weight) {
		super();
		this.namePets = namePets;
		this.idPerson = idPerson;
		this.agePets = agePets;
		this.species = species;
		this.race = race;
		this.characteristic = characteristic;
		this.weight = weight;
	}
	
	public PetsDto() {
		
	}
	
	public String getNamePets() {
		return namePets;
	}
	public void setNamePets(String namePets) {
		this.namePets = namePets;
	}
	public PersonDto getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(PersonDto idPerson) {
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
