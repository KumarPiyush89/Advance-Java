package pojo_classes;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class Ipl {
	private String[] teams;

	public String[] getTeams() {
		return teams;
	}

	public void setTeams(String[] teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {
		return "Ipl [teams=" + Arrays.toString(teams) + "]";
	}
	
}
