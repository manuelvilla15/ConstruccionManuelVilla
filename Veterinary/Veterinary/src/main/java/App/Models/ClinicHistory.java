package App.Models;

import java.sql.Date;



public class ClinicHistory {
	private Date clinicHistoryDate;
	private Person veterinarian;
	private String reasonForConsultation;
	private String symptomatology;
	private String procedures;
	private String medicines;
	private Order orderId;
	private String vaccinationHistory;
	private String allergies;
	private String detailedProcedure;
	
	public ClinicHistory() {
		this.clinicHistoryDate = new Date(System.currentTimeMillis());
	}
	public Person getVeterinarian() {
		return veterinarian;
	}
	public void setVeterinarian(Person veterinarian) {
		this.veterinarian = veterinarian;
	}
	public String getReasonForConsultation() {
		return reasonForConsultation;
	}
	public void setReasonForConsultation(String reasonForConsultation) {
		this.reasonForConsultation = reasonForConsultation;
	}
	public String getSymptomatology() {
		return symptomatology;
	}
	public void setSymptomatology(String symptomatology) {
		this.symptomatology = symptomatology;
	}
	public String getProcedures() {
		return procedures;
	}
	public void setProcedures(String procedures) {
		this.procedures = procedures;
	}
	public String getMedicines() {
		return medicines;
	}
	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}
	public Order getOrderId() {
		return orderId;
	}
	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}
	public String getVaccinationHistory() {
		return vaccinationHistory;
	}
	public void setVaccinationHistory(String vaccinationHistory) {
		this.vaccinationHistory = vaccinationHistory;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	public String getDetailedProcedure() {
		return detailedProcedure;
	}
	public void setDetailedProcedure(String detailedProcedure) {
		this.detailedProcedure = detailedProcedure;
	}
	
	

}
