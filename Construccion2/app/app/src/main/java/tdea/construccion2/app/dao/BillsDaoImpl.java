package tdea.construccion2.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdea.construccion2.app.Models.Bills;
import tdea.construccion2.app.Models.Person;
import tdea.construccion2.app.Models.Pets;
import tdea.construccion2.app.dto.BillsDto;
import tdea.construccion2.app.repository.BillsRepository;

@Service
public class BillsDaoImpl  implements BillsDao{

	@Autowired
	private BillsRepository billsRepository;
	
	@Override
	public void createBills(BillsDto billsDto) throws Exception{
		Bills bills = new Bills();
		bills.setIdBill(billsDto.getIdBill());
		bills.setIdPet(new Pets(billsDto.getIdPet()));
		bills.setIdPerson(new Person(billsDto.getIdPerson()));
		bills.setWorth(bills.getWorth());
		bills.setProductName(bills.getProductName());
		bills.setAmount(bills.getAmount());
		bills.setInvoiceDate(bills.getInvoiceDate());
		billsRepository.save(bills);
		
		
	}

	@Override
	public boolean findBillsExist(BillsDto billsDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existBillsByBills(BillsDto billsDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BillsDto findBillsByBills(BillsDto billsDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
