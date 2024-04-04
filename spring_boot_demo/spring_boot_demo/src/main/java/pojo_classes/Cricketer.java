package pojo_classes;

import org.springframework.stereotype.Component;

@Component
public class Cricketer {
	private String name;
	private int age;
	private String team;
	
	
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
		return "Cricketer [name=" + name + ", age=" + age + ", team=" + team + "]";
	}
}
