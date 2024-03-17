package App.Models;

import java.sql.Date;

public class Order {
	private long idOrder;
	private Pets idPet;
	private Person idOwner; 
	private Person idVet;
	private String medicineName;
	private Date generationDate;
	
	public long getIdOrder() {
		return idOrder;
		
	}
	public void setIdOrder(long idOrder) {
		this.idOrder = idOrder;
	}
	public Pets getIdPet() {
		return idPet;
	}
	public void setIdPet(Pets idPet) {
		this.idPet = idPet;
	}
	public Person getIdOwner() {
		return idOwner;
	}
	public void setIdOwner(Person idOwner) {
		this.idOwner = idOwner;
	}
	public Person getIdVet() {
		return idVet;
	}
	public void setIdVet(Person idVet) {
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
