package tdea.construccion2.app.Models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.ClinicHistoryDto;


@Entity
@Table(name="historia")
public class ClinicHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="fecha")
	private Date clinicHistoryDate;
	@ManyToOne
	@JoinColumn(name="medico")
	private Person veterinarian;
	@Column(name="motivo")
	private String reasonForConsultation;
	@Column(name="sintomatologia")
	private String symptomatology;
	@Column(name="procedimiento")
	private String procedures;
	@Column(name="medicines")
	private String medicines;
	@ManyToOne
	@JoinColumn(name="order")
	private Order orderId;
	@Column(name="vacunacion")
	private String vaccinationHistory;
	@Column(name="alergia")
	private String allergies;
	@Column(name="detalles_procedimiento")
	private String detailedProcedure;

	public ClinicHistory() {
	this.clinicHistoryDate = new Date(System.currentTimeMillis());
}
	
	public ClinicHistory(ClinicHistoryDto clinicHistoryDto) {
		this.clinicHistoryDate=clinicHistoryDto.clinicHistoryDate();
		this.veterinarian= new Person(clinicHistoryDto.getVeterinarian());
		this.reasonForConsultation=clinicHistoryDto.getReasonForConsultation();
		this.symptomatology=clinicHistoryDto.getSymptomatology();
		this.procedures=clinicHistoryDto.getProcedures();
		this.medicines=clinicHistoryDto.getMedicines();
		this.orderId= new Order(clinicHistoryDto.getOrderId());
		this.vaccinationHistory=clinicHistoryDto.getVaccinationHistory();
		this.allergies=clinicHistoryDto.getAllergies();
		this.detailedProcedure=clinicHistoryDto.getDetailedProcedure();
	}
	
	
	public Date getClinicHistoryDate() {
		return clinicHistoryDate;
	} 

	public void setClinicHistoryDate(Date clinicHistoryDate) {
		this.clinicHistoryDate = clinicHistoryDate;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
