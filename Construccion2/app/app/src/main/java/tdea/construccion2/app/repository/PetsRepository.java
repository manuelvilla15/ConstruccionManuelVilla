package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tdea.construccion2.app.Models.Pets;

@Repository
public interface PetsRepository extends JpaRepository<Pets, Long>{
	public Pets findById(long id);
}
