package tdea.construccion2.app.dto;

import java.sql.Date;

public class BillsDto {
	private long idBill;
	private PetsDto idPet;
	private PersonDto idPerson;
	private String productName;
	private double worth;
	private int amount;
	private Date invoiceDate;

	
	public BillsDto(long idBill, PetsDto idPet, PersonDto idPerson, String productName, double worth, int amount) {
		super();
		this.idBill = idBill;
		this.idPet = idPet;
		this.idPerson = idPerson;
		this.productName = productName;
		this.worth = worth;
		this.amount = amount;
		this.invoiceDate = new Date(System.currentTimeMillis());
	}

	public BillsDto() {
		super();
	}

	public long getIdBill() {
		return idBill;
	}
	public void setIdBill(long idBill) {
		this.idBill = idBill;
	}
	public PetsDto getIdPet() {
		return idPet;
	}
	public void setIdPet(PetsDto idPet) {
		this.idPet = idPet;
	}
	public PersonDto getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(PersonDto idPerson) {
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
