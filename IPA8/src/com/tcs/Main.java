package com.tcs;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie>sotre= new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		int taleinput=sc.nextInt();sc.nextLine();
		for(int i=0;i<taleinput;i++)
		{
			String movie= sc.nextLine();
			String company= sc.nextLine();
			String genre= sc.nextLine();
			int budget= sc.nextInt();
			sc.nextLine();
			sotre.add(new Movie(movie,company,genre,budget));
			
		}
		System.out.println("take genre");
		String seacrhgener=sc.nextLine();
		ArrayList<Integer>filter= new ArrayList<>();
		filter.addAll(Movie.getMovieByGenre(sotre, seacrhgener));
		for(Integer mov:filter)
		{if(mov>80000000)
		{
			System.out.println("high Budget");
		}
		else {
			System.out.println("Low budget");
		}
			
		}
	}

}
