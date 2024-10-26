package com.tcs;
import java.util.*;
public class Employees {
	public int empID;
	public String name;
	public String branch;
	public double rating;
	public boolean companyTransport;
	
	public Employees(int empID, String name, String branch, double rating, boolean companyTransport )
	{
		this.empID=empID;
		 this.name=name;
		 this.branch=branch;
		 this.rating=rating;
		 this.companyTransport=companyTransport;
	}
	
	 public static int findCountEmpusingTransport(ArrayList<Employees>employees,String data)
	 {int count=0;
		 if(employees.size()==0)
		 {
			 return 0;
			 }
		 
		 boolean transportStatus= Boolean.parseBoolean(data);
		 for(Employees emp:employees)
		 {
			 if(transportStatus==emp.companyTransport)
			 {
				 count++;
			 } 
		 }
		 return count;
	 }
	 
	 public static ArrayList<Employees> findEmployeeWithSecondHighestRating(ArrayList<Employees>employees)
	 {ArrayList<Employees>newList=new ArrayList<>();
	 
		 if(employees.size()<2)
		 {
			 return newList;
		 }
		 Collections.sort(employees,new Comparator<Employees>() {
			 public int compare(Employees e1, Employees e2)
			 {
				 return Double.compare(e2.rating,e1.rating);
			 }
		});
		 
		 double highrating= employees.get(0).rating;
		 double secondHighestRating = -1;
		 for(Employees emp:employees)
		 {
			 if(emp.rating<highrating)
			 { secondHighestRating = emp.rating;
             break;
				 
			 }
		 }
		 for (Employees emp : employees) {
	            if (emp.rating == secondHighestRating) {
	                newList.add(emp);
	            }
	        }
		 return newList;
		 
	 }

}
