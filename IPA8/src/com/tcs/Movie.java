package com.tcs;
import java.util.*;
public class Movie {
	private  String movieName;
	private String companyName;
	private String gener;
	private int budget;
	public Movie(String movieName,String companyName,String gener, int budget)
	{this.movieName=movieName;
	this.companyName=companyName;
	 this.gener=gener;
	 this.budget=budget;
		
	}
	public String getmovie()
	{
		return movieName;
	}
	public String getcompany()
	{
		return companyName;
	}
	public String getgenre()
	{
		return gener;
	}
	public int getbudget()
	{
		return budget;
	}
public static ArrayList<Integer> getMovieByGenre(ArrayList<Movie>movie,String searchgener)
{
	ArrayList<Integer>filter= new ArrayList<>();
	for(Movie mov:movie)
	{
		if(mov.getgenre().equalsIgnoreCase(searchgener))
		{
			filter.add(mov.getbudget());
		}
	}
	return filter;
}


}
