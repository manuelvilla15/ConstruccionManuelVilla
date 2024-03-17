package App.dto;

import javax.swing.border.Border;

public class ClinicHistoryDto {
	private long date;
	private PersonDto veterinarian;
	private String reasonForConsultation;
	private String symptomatology;
	private String procedures;
	private String medicines;
	private OrderDto idOrder;
	private String vaccinationHistory;
	private String allergies;
	private String detailedProcedure;
	
	public ClinicHistoryDto(long date, PersonDto veterinarian, String reasonForConsultation, String symptomatology,
			String procedures, String medicines, OrderDto idOrder, String vaccinationHistory, String allergies,
			String detailedProcedure) {
		super();
		this.date = date;
		this.veterinarian = veterinarian;
		this.reasonForConsultation = reasonForConsultation;
		this.symptomatology = symptomatology;
		this.procedures = procedures;
		this.medicines = medicines;
		this.idOrder = idOrder;
		this.vaccinationHistory = vaccinationHistory;
		this.allergies = allergies;
		this.detailedProcedure = detailedProcedure;
	}
	public ClinicHistoryDto() {
		
	}
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	public PersonDto getVeterinarian() {
		return veterinarian;
	}
	public void setVeterinarian(PersonDto veterinarian) {
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
	public OrderDto getOrderId() {
		return idOrder;
	}
	public void setIdOrder(OrderDto idOrder) {
		this.idOrder = idOrder;
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
