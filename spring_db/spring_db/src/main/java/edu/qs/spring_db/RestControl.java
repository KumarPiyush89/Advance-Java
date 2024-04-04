package edu.qs.spring_db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.qs.spring_db.entity.Cricketer;
import edu.qs.spring_db.reposetry.CricketerRepository;

@RestController
public class RestControl {
	
	@Autowired
	CricketerRepository repo;
	
	@PostMapping("/cricketer")
	public void setCricketer(@RequestBody Cricketer c) {
		
		repo.save(c);
	}
	
//	send data
	@PostMapping("/cricketers")
	public String setMultipleCricketer(@RequestBody List<Cricketer> clist) {
		repo.saveAll(clist);
		return "Success";
	}

	
//	fetch data
	
	@GetMapping("/cricketer")
	public List<Cricketer> getAllCricketers(){
		return repo.findAll();
	}

// fetch data to id	
	@GetMapping("/cricketer/{id}")
	public Cricketer getCricketer(@PathVariable int id) {
		Optional<Cricketer> opt = repo .findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			return null;
		}
 	}
	
//	fetch data from name
	@PostMapping("/cricketer/name/{name}")
	public List<Cricketer> getByName(@PathVariable String name){
		return repo.findByName(name);
	}
	
	
//	fetch the data from maxAge
	@GetMapping("/cricketer/age")
	public int getMaxAge() {
		return repo.findMaxAge();
		
	}
	
	
//	Delete the data from id
	@DeleteMapping("/cricketer/{id}")
	public String delectCricketer(@PathVariable int id) {
		repo.deleteById(id);
		return "success";
	}
	
//	Delete all Data
	@DeleteMapping("/cricketer")
	public String deleteAllCricketers() {
		repo.deleteAll();
		return "Delete all";
	}
	
	
//	Update data 
	@PutMapping("/cricketer")
	public String updateCricketer(@RequestBody Cricketer c) {
		repo.save(c);
		return "success";
		
	}
}
