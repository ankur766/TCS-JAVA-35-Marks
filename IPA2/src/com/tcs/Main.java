package com.tcs;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter company Name");
		String companyName=sc.nextLine();
		System.out.println("Enter Number of Employee");
		int numEmployee=sc.nextInt();
		ArrayList<Employees>employee=new ArrayList<>();
		sc.nextLine();
		for(int i=0;i<numEmployee;i++)
		{
			System.out.println("Enter Name id");
			int id=sc.nextInt();sc.nextLine();
			System.out.println("Enter name");
			
			String name= sc.nextLine();
			System.out.println("Enter desination");
			String desination=sc.nextLine();
			System.out.println("Enter salary");
			double salary=sc.nextDouble();
			sc.nextLine();
			
			
			employee.add(new Employees(id, name, desination, salary));
		}
		System.out.println("enter des");
		String desegination= sc.nextLine();
		
		System.out.println("Get Avgsalary");
		System.out.println(Company.getavgsalary(employee));
		System.out.println("Get Maxsalary");
		System.out.println(Company.getmaxSalary(employee));
		
		ArrayList<Employees>filterList=Company.getEmpByDes(employee, desegination);
		for(Employees emp:filterList)
		{
			System.out.println("id :"+emp.getid()+", name :"+emp.getname()+",des :"+emp.getdesgination()+" , salary"+emp.getsalary());
		}
	}

}
