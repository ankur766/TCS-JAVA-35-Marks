package com.tcs;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Player>player= new ArrayList<>();
		Scanner sc= new Scanner (System.in);
		int takeinput=sc.nextInt();sc.nextLine();
		while(takeinput!=0)
		{System.out.println("take playe id");
		int id=sc.nextInt();sc.nextLine();
		
		System.out.println("Skill");
		String Skill= sc.nextLine();
		
		System.out.println("take level");
		String level= sc.nextLine();
		System.out.println("take points");
		int points= sc.nextInt();sc.nextLine();
		player.add(new Player (id,Skill,level,points));
		takeinput--;
			
		}
		System.out.println("Enter Skill for find");
		String SearchSkill= sc.nextLine();
		System.out.println("Enter levle for find");
		String Searchlevel= sc.nextLine();
		
		System.out.println(Player.findpointsskill(player,SearchSkill));
		ArrayList<Player>filterPlayer= new ArrayList<>();
		
		filterPlayer.addAll(Player.getplayerbasedonlevel(player, Searchlevel, SearchSkill));
		for(Player play:filterPlayer)
		{
			System.out.println(play.getid());
		}
	}

}
