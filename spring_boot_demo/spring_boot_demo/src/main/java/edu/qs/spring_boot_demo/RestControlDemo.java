package edu.qs.spring_boot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import pojo_classes.Cricketer;
import pojo_classes.Ipl;
import pojo_classes.Mobile;
import pojo_classes.Team;

@RestController
public class RestControlDemo {
	@Autowired
	Employee emp;
	
	Mobile mobile;
	
	@GetMapping("/display")
	public String display() {
		return "Hello Boot";
	}
	
	@PostMapping("/display2")
	public void display2() {
		System.out.println("This is display 2");
	}
	
	@GetMapping("/getemp")
	public Employee getEmployee() {
		emp.setId(101);
		emp.setName("Vikash");
		emp.setSalary(30000);
		
		return emp;
	}
	
	@GetMapping("/getmobile")
	public Mobile getMobile() {
		
		mobile.setName("Samsung");
		mobile.setBrand("Sam");
		mobile.setPrice(852);
		
		return mobile;
	}
	
	
//	@PostMapping("/cricketer")
//	public void setCricketer(@RequestParam String name,@RequestParam int age, @RequestParam String team ) {
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(team);
//		
//		
//	}
	
	@PostMapping("/employee/{id}/{name}/{salary}")
	public void setEmployee(@PathVariable int id, @PathVariable String name, @PathVariable double salary ) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	@PostMapping("/student")
	public void setStudent(@RequestHeader int id,@RequestHeader String name,@RequestHeader double percentage ) {
		System.out.println("ID :-"+id);
		System.out.println("Name :-"+name);
		System.out.println("perc :-"+percentage);
	}
	
	
	@PostMapping("/cricketer")
	public void setCricketer(@RequestBody Cricketer c) {
		System.out.println(c);
	}
	
	@PostMapping("/ipl")
	public void setIpl(@RequestBody Ipl ipl) {
		System.out.println(ipl);
	}
	
	
	@PostMapping("team")
	public void setTeam(@RequestBody Team team) {
		System.out.println(team);
	}
	
	
}
