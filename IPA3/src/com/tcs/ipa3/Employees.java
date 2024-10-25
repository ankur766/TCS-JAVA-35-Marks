package com.tcs.ipa3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Employees {
	private int id;
	 private String empName;
	 private int age;
	 private String gender;
	 private double salary;
	 public Employees(int id , String empName,int age, String gender, double salary)
	 {
		 this.id=id;
		 this.empName=empName;
		 this.age=age;
		 this.gender=gender;
		 this.salary=salary;
	 }
	 public int getid()
	 {
		 return id;
	 }
	 public String getname() {
		 return empName;
	 }
	 public int getage()
	 {
		 return age;
	 }
	 public double getsalary()
	 {
		 return salary;
	 }
	 
	 public static ArrayList<Employees> getEmpWithLowSalary(ArrayList<Employees>employees)
	 {ArrayList<Employees>newList= new ArrayList<>();
		 int lowSalary= Integer.MAX_VALUE;
		 Collections.sort(employees,new Comparator<Employees>() {
			 public int compare(Employees e1, Employees e2)
			 {
				 return Double.compare(e1.getsalary(), e2.getsalary());
			 }
		});
		 
		double lowsalary= employees.get(0).getsalary();
		for(Employees emp:employees)
		{
			if(emp.getsalary()>lowsalary)
			{
				newList.add(emp);
				break;
			}
				
			
		 }
		 return newList;
	 }
	 
	 public static int countEmpbyAge(ArrayList<Employees>employees,int age)
	 {
		 int count=0;
		 for(Employees emp: employees)
		 {
			 if(emp.getage()==age)
			 {
				 count++;
			 }
		 }
		 return count;
	 }
}


