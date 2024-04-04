package edu.qs.spring_db.reposetry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.qs.spring_db.entity.Cricketer;

public interface CricketerRepository extends JpaRepository<Cricketer, Integer >{
	List<Cricketer> findByName(String name);
	
	@Query("select max(c.age) from Cricketer c")
	int findMaxAge();
}
