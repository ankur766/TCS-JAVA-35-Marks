package com.tcs;
import java.util.*;


public class Main {
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		 ArrayList<AutonomousCar> arr= new ArrayList<>();
		 int takeinput= sc.nextInt();sc.nextLine();
		 for(int i=0;i<takeinput;i++)
		 {
			 int id= sc.nextInt();sc.nextLine();
			 String brand= sc.nextLine();
			 int conducted= sc.nextInt();sc.nextLine();
			 int passed= sc.nextInt();sc.nextLine();
			 String env= sc.nextLine();
			 arr.add(new AutonomousCar(id, brand, conducted, passed, env));
			 
		 }
		 String enviro= sc.nextLine();
		 String brand= sc.nextLine();
		 
		 System.out.println(AutonomousCar.findTestPassedByEnv(arr, enviro));
		 ArrayList<String>grade= new ArrayList<>();
		 grade.addAll(AutonomousCar.updatecargrade(arr, brand));
		 for(String g:grade)
		 {
			 System.out.println(g);
		 }
	}

}
