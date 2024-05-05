package tdea.construccion2.app.Models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.BillsDto;

@Entity
@Table(name="factura")
public class Bills {
	@Id
	@Column(name="id")
	private long idBill;
	@ManyToOne
	@JoinColumn(name="mascota")
	private Pets idPet;
	@ManyToOne
	@JoinColumn(name="propietario")
	private Person idPerson;
	@Column(name="producto")
	private String productName;
	@Column(name="valor")
	private double worth;
	@Column(name="cantidad")
	private int amount;
	@Column(name="fecha")
	private Date invoiceDate;
	
	public Bills(BillsDto billsDto) {
		this.idBill=billsDto.getIdBill();
		this.idPet= new Pets(billsDto.getIdPet());
		this.idPerson= new Person(billsDto.getIdPerson());
		this.productName=billsDto.getProductName();
		this.worth=billsDto.getWorth();
		this.amount=billsDto.getAmount();
		this.invoiceDate=billsDto.getInvoiceDate();
		
	}

	public Bills() {
		super();
	}

	public long getIdBill() {
		return idBill;
	}

	public void setIdBill(long idBill) {
		this.idBill = idBill;
	}

	public Pets getIdPet() {
		return idPet;
	}

	public void setIdPet(Pets idPet) {
		this.idPet = idPet;
	}

	public Person getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Person idPerson) {
		this.idPerson = idPerson;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getWorth() {
		return worth;
	}

	public void setWorth(double worth) {
		this.worth = worth;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	} 


}
