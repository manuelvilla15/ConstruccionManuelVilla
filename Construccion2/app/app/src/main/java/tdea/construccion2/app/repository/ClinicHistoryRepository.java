package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tdea.construccion2.app.Models.ClinicHistory;

@Repository
public interface ClinicHistoryRepository extends JpaRepository<ClinicHistory, Long>{
	public ClinicHistory findById(int id);

}
