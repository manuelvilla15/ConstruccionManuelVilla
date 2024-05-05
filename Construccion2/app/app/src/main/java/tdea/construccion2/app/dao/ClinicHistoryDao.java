package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.ClinicHistoryDto;


public interface ClinicHistoryDao {
	
	public void createClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;
	public void findClinicHistoryById(ClinicHistoryDto clinicHistoryDto) throws Exception;
	public boolean findClinicHistoryDaoExist(ClinicHistoryDto clinicHistoryDto)throws Exception;
	public boolean existClinicHistoryDaoByPets(ClinicHistoryDto clinicHistoryDto) throws Exception;
	public boolean updateClinicHistory(ClinicHistoryDto clinicHistoryDto) throws Exception;
	public ClinicHistoryDao findClinicHistoryDaoByClinicHistoryDao(ClinicHistoryDto clinicHistoryDto) throws Exception;

}
