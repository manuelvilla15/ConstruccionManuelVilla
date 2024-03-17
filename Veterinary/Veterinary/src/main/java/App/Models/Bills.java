package App.Models;

import java.sql.Date;

public class Bills {
	private long idBill;
	private Pets idPet;
	private Person idPerson;
	private String productName;
	private double worth;
	private int amount;
	private Date invoiceDate;
	

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
