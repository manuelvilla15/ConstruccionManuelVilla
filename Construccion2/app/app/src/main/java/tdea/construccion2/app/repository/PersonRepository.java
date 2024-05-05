package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tdea.construccion2.app.Models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	public boolean existsById(long id);
	public Person findById(long id);
	
	
}
