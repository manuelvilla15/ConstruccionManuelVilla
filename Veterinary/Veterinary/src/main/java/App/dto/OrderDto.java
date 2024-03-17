package App.dto;

import java.sql.Date;

public class OrderDto {
	private long idOrder;
	private PetsDto idPet;
	private PersonDto idOwner; 
	private PersonDto idVet;
	private String medicineName;
	private Date generationDate;
	
	
	
	public OrderDto(long idOrder, PetsDto idPet, PersonDto idOwner, PersonDto idVet, String medicineName) {
		super();
		this.idOrder = idOrder;
		this.idPet = idPet;
		this.idOwner = idOwner;
		this.idVet = idVet;
		this.medicineName = medicineName;
		this.generationDate = new Date(System.currentTimeMillis()); 
	}

	public OrderDto() {
	
	}

	public long getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(long idOrder) {
		this.idOrder = idOrder;
	}

	public PetsDto getIdPet() {
		return idPet;
	}

	public void setIdPet(PetsDto idPet) {
		this.idPet = idPet;
	}

	public PersonDto getIdOwner() {
		return idOwner;
	}

	public void setIdOwner(PersonDto idOwner) {
		this.idOwner = idOwner;
	}

	public PersonDto getIdVet() {
		return idVet;
	}

	public void setIdVet(PersonDto idVet) {
		this.idVet = idVet;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public Date getGenerationDate() {
		return generationDate;
	}

	public void setGenerationDate(Date generationDate) {
		this.generationDate = generationDate;
	}

	

	
}
