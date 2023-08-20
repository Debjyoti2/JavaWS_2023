package com.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {


		Player p1 = new Player("Sachin","BAT",92);
		Player p2 = new Player("Sourav","Ball",32);
		Player p3 = new Player("Virat","BAT",76);
		
		List<Player> players = new ArrayList<>();
		players.add(p1);
		players.add(p2);
		players.add(p3);
		
		Team team = new Team();
		team.setPlayers(players);
		
		System.out.println(team);
		
		Integer totalscore = team.getPlayers().stream().map(e->e.getScore()).reduce(0,(e1,e2)->e1+e2);
		
		System.out.println(totalscore);
		
		Map<String,List<Player>> mymap= team.getPlayers().stream().collect(Collectors.groupingBy(e->e.getType(),Collectors.toList()));
		
		System.out.println(mymap);
		
		
	}

}
