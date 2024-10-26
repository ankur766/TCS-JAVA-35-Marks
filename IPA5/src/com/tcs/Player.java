package com.tcs;
import java.util.*;
public class Player {
	private  int playerId;
	private String skill;
	 private String level;
	 private int points;
	 public Player(int playerId,String skill,String level,int points)
	 {
		 this.playerId=playerId;
		 this.skill=skill;
		 this.level=level;
		 this.points=points;
	 }
	 public int getid()
	 {
		 return playerId;
	 }
	 public String getSkill()
	 {
		 return skill;
	 }
	 public String getlevel()
	 {
		 return level;
	 }
	 public int getpoints()
	 {
		 return points;
	 }
	 public static int findpointsskill(ArrayList<Player>player,String skill)
	 { int totalPoints=0;
		 if(player.size()==0)
		 {
			 return 0;
		 }
		 for(Player play:player)
		 {
			 if(play.getSkill().equalsIgnoreCase(skill))
			 {totalPoints+=play.getpoints();
				 
			 }
		 }
		
		 return totalPoints;
	 }
	 public static ArrayList<Player> getplayerbasedonlevel(ArrayList<Player>player,String level,String skill)
	 {ArrayList<Player>newPlayer=new ArrayList<>();
		 for(Player play:player)
		 {
			 if(play.getlevel().equalsIgnoreCase(level)&&play.getSkill().equalsIgnoreCase(skill))
			 {
				 if(play.getpoints()>=20)
				 {
					 newPlayer.add(play);
				 }
			 }
		 }
		 return newPlayer;
	 }
	 
}

