package tdea.construccion2.app.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdea.construccion2.app.Models.ClinicHistory;
import tdea.construccion2.app.Models.Order;
import tdea.construccion2.app.Models.Person;
import tdea.construccion2.app.dto.ClinicHistoryDto;
import tdea.construccion2.app.repository.ClinicHistoryRepository;

@Service
public class ClinicHistoryDaoImpl implements ClinicHistoryDao {
	
	@Autowired
	private ClinicHistoryRepository clinicHistoryRepository;
	

	@Override
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception {
		ClinicHistory clinicHistory = new ClinicHistory();
		clinicHistory.setVeterinarian(new Person(clinicHistoryDto.getVeterinarian()));
		clinicHistory.setReasonForConsultation(clinicHistoryDto.getReasonForConsultation());
		clinicHistory.setSymptomatology(clinicHistoryDto.getSymptomatology());
		clinicHistory.setProcedures(clinicHistoryDto.getProcedures());
		clinicHistory.setMedicines(clinicHistoryDto.getMedicines());
		clinicHistory.setOrderId(new Order(clinicHistoryDto.getIdOrder()));
		clinicHistory.setVaccinationHistory(clinicHistoryDto.getVaccinationHistory());
		clinicHistory.setAllergies(clinicHistoryDto.getAllergies());
		clinicHistory.setDetailedProcedure(clinicHistoryDto.getDetailedProcedure());
		clinicHistoryRepository.save(clinicHistory);
	} 
	@Override
	public boolean updateClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception {
		ClinicHistory clinicHistory = new ClinicHistory(clinicHistoryDto);
		clinicHistoryRepository.save(clinicHistory);
		return false;
	}

	@Override
	public void findClinicHistoryById(ClinicHistoryDto clinicHistoryDto) throws Exception {
		//ClinicHistory clinicHistory = clinicHistoryRepository.finById(clinicHistoryDto);
		
	}
	
	@Override
	public boolean findClinicHistoryDaoExist(ClinicHistoryDto clinicHistoryDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existClinicHistoryDaoByPets(ClinicHistoryDto clinicHistoryDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ClinicHistoryDao findClinicHistoryDaoByClinicHistoryDao(ClinicHistoryDto clinicHistoryDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

	


	
	

}
