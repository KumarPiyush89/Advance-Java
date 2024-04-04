package pojo_classes;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Team {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private ArrayList<Player> players;

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", players=" + players + "]";
	}

	
	
}
