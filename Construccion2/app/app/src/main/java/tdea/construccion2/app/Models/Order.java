package tdea.construccion2.app.Models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.OrderDto;
@Entity
@Table(name="orden")
public class Order {
	@Id
	@Column(name="id")
	private long idOrder;
	@ManyToOne
	@JoinColumn(name="mascota")
	private Pets idPet;
	@ManyToOne
	@JoinColumn(name="propietario")
	private Person idOwner;
	@ManyToOne
	@JoinColumn(name="medico")
	private Person idVet;
	@Column(name="medicamento")
	private String medicineName;
	@Column(name="fecha")
	private Date generationDate;
	
	public Order(OrderDto orderDto) {
		this.idOrder=orderDto.getIdOrder();
		this.idPet=new Pets(orderDto.getIdPet());
		this.idOwner= new Person(orderDto.getIdOwner());
		this.idVet= new Person(orderDto.getIdVet());
		this.medicineName=orderDto.getMedicineName();
		this.generationDate=orderDto.getGenerationDate();

	} 
	
	
	public Order() {
		
	}


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
