package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tdea.construccion2.app.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public User findByUser(String user);
	public boolean existsByUser(String user);

}
