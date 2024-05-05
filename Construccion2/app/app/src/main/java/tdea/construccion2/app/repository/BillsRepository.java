package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdea.construccion2.app.Models.Bills;

@Repository
public interface BillsRepository extends JpaRepository<Bills, Long>{
	public Bills findById(long id);
}
