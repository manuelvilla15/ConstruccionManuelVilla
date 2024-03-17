package App.Validator;

import java.sql.Date;

public class BillsInputsValidator extends InputsValidator{
	
	public long idBillsValidator(String idBills) throws Exception {
		return super.longValidator(idBills, " Id de factura");
	}
	public long idPetValidator(String idPet) throws Exception {
		return super.longValidator(idPet, " Id de la mascota");
	}
	
	public long idPersonValidator(String idPerson) throws Exception {
		return super.longValidator(idPerson, " Id del dueño");
	}
	
	public void productNameValidator(String productName) throws Exception {
		super.stringValidator(productName, " Nombre del producto");
	}
	
	public double worthValidator(String worth) throws Exception {
		return super.doubleValidator(worth, " Valor");
	}
	
	public int amountValidator(String amount) throws Exception {
		return super.integerValidator(amount, " Cantidad");
	}
	
	public Date invoiceDateValidator(String worth) throws Exception {
		return super.DateValidator(worth, " Fecha");
	}

}
