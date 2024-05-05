package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.BillsDto;


public interface BillsDao {
	public void createBills(BillsDto billsDto) throws Exception;
	public boolean findBillsExist(BillsDto billsDto)throws Exception;
	public boolean existBillsByBills(BillsDto billsDto) throws Exception;
	public BillsDto findBillsByBills(BillsDto billsDto) throws Exception;

}
