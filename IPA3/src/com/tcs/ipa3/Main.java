package com.tcs.ipa3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		ArrayList<Employees>employe= new ArrayList<>();
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number of emp");
	int numEMp= sc.nextInt();
	sc.nextLine();
	for(int i=0;i<numEMp;i++)
	{
		System.out.println("Enter id");
		int id= sc.nextInt();sc.nextLine();
		System.out.println("Enter name");
		String name= sc.nextLine();
		System.out.println("Enter age");
		int age= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter gender");
		String gender= sc.nextLine();
		System.out.println("Enter salary");
		double salary= sc.nextDouble();
		employe.add(new Employees(id,name,age,gender,salary));
		
	}
	System.out.println("Enter age for search");
	int searchAge= sc.nextInt();sc.nextLine();
	ArrayList<Employees>secondsalry= new ArrayList<>();
	secondsalry.addAll(Employees.getEmpWithLowSalary(employe));
	for(Employees emp:secondsalry)
	{
		System.out.println(emp.getid()+"#"+emp.getname());
	}
	int count= Employees.countEmpbyAge(employe,searchAge);
	System.out.println(count);
		
	}

}
