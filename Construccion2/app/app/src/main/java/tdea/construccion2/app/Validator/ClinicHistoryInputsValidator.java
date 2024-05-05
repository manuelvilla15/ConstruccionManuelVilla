package tdea.construccion2.app.Validator;

import org.springframework.stereotype.Component;

@Component
public class ClinicHistoryInputsValidator extends InputsValidator{
	
	public long dateValidator(String date) throws Exception {
		return super.longValidator(date, "Fecha"); 
	}
	
	public void veterinarianValidator(String veterinarian) throws Exception {
		super.stringValidator(veterinarian, "Medico Veterinario");
	}
	
	public void reasonForConsultationValidator(String reasonForConsultation) throws Exception {
		super.stringValidator(reasonForConsultation, "Motivo de consulta");
	}
	
	public void symptomatologyValidator(String symptomatology) throws Exception {
		super.stringValidator(symptomatology, "Sintomatologia");
	}
	
	public void proceduresValidator(String procedures) throws Exception {
		super.stringValidator(procedures, "Procedimiento");
	}
	
	public void medicinesValidator(String medicines) throws Exception {
		super.stringValidator(medicines, "Medicamentos");
	}
	
	public long idOrderValidator(String orderId) throws Exception {
		return super.longValidator(orderId, "Id de orden");
	}
	
	public void vaccinationHistoryValidator(String vaccinationHistory) throws Exception {
		super.stringValidator(vaccinationHistory, "Historia de vacunacion");
	} 
	
	public void allergiesValidator(String allergies) throws Exception {
		super.stringValidator(allergies, "Alergias");
	}
	
	public void detailedProcedureValidator(String detailedProcedure) throws Exception {
		super.stringValidator(detailedProcedure, "Detalles del procedimiento");
	}


}
