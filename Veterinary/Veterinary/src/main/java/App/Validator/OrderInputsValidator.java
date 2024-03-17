package App.Validator;

import java.sql.Date;

public class OrderInputsValidator extends InputsValidator{
	
	public long idOrderValidator(String idOrder) throws Exception {
		return super.longValidator(idOrder, "Id de orden");
	}
	
	public long idPetValidator(String idPet) throws Exception {
		return super.longValidator(idPet, "Id de mascota");
	}
	
	public long idOwnerValidator(String idOwner) throws Exception {
		return super.longValidator(idOwner, "Id del dueño");
	}
	
	public long idVetValidator(String idVet) throws Exception {
		return super.longValidator(idVet, "Id del veterinario");
	}
	
	public void medicineNameValidator(String medicineName) throws Exception {
		super.longValidator(medicineName, "Nombre del medicamento");
	}
	
	public Date generationDateValidator(String generationDate) throws Exception {
		return super.DateValidator(generationDate, "Fecha de generacion");
	}


}
