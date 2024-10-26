package com.tcs;
import java.util.*;
public class AutonomousCar {
	private int carId;
	private String brand;
	private int noOftestconducted;
	private int noOfTestpassed;
	private String enviroment;
	public AutonomousCar(int carId, String brand,int noOftestconducted, int noOftestpassed,String enviroment)
	{
		this.carId=carId;
		this.brand=brand;
		this.noOftestconducted=noOftestconducted;
		this.noOfTestpassed=noOftestpassed;
		this.enviroment=enviroment;
	}
	public int getid()
	{
		return carId;
	}
	public String getbrand()
	{
		return brand;
	}
	public int getconducted()
	{
		return noOftestconducted;
	}
	public int getnoOfpassed()
	{
		return noOfTestpassed;
	}
	public String getenviroment()
	{
		return enviroment;
	}
	
	public static int findTestPassedByEnv(ArrayList<AutonomousCar>autocar,String enviroment)
	{
		int sumpassed=0;
		for(AutonomousCar car:autocar)
		{if(car.getenviroment().equalsIgnoreCase(enviroment))
		{
			sumpassed+=car.getnoOfpassed();
		}
		}
		return sumpassed;
	}
	
	public static ArrayList<String>updatecargrade(ArrayList<AutonomousCar>autocar,String brand)
	{
		ArrayList<String>rating=new ArrayList<>();
		for(AutonomousCar car:autocar)
		{if(car.getbrand().equalsIgnoreCase(brand))
		{
			int ratecar=(car.getnoOfpassed()*100)/car.getconducted();
			 if(ratecar>=80)
			 {
				 rating.add("A1");
			 }
			 else {
				 rating.add("B1");
			 }
		}
		}
		return rating;
	}
	

}
