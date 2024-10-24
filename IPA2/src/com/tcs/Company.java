package com.tcs;
import java.util.*;

public class Company {
	private String companyName;
	private ArrayList<Employees>employees=new ArrayList<>();
	private int numemployess;
	public Company(String companyName, ArrayList<Employees> employees, int numemployess) {
		this.companyName = companyName;
		this.employees = employees;
		this.numemployess = numemployess;
	}
	public static double getavgsalary(ArrayList<Employees> employee)
	{double total=0;
	double avg=0;
		
		for(Employees emp:employee)
	{
			total= emp.getsalary();
	}
		avg=total/employee.size();
		return avg;
		
	}
	public static double getmaxSalary(ArrayList<Employees>employee)
	{
		double maxsalary= Integer.MIN_VALUE;
		for(Employees emp:employee)
		{
			maxsalary=Math.max(emp.getsalary(), maxsalary);
		}
		return maxsalary;
	}
	public static ArrayList<Employees> getEmpByDes(ArrayList<Employees>employee,String des)
	{
		ArrayList<Employees>newEmp= new ArrayList();
		for(Employees emp:employee)
		{
			if(emp.getdesgination().equalsIgnoreCase(des))
			{
				newEmp.add(emp);
			}
		}
		return newEmp;
	}

}
