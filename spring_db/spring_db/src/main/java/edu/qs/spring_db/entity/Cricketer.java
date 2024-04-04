package edu.qs.spring_db.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cricketer {
	@Id
	private int id;
	private String name;
	private int age;
	private String team;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Cricketer [id=" + id + ", name=" + name + ", age=" + age + ", team=" + team + "]";
	}
	
	
}
