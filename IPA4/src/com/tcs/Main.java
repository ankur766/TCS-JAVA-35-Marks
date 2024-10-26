package com.tcs;
import java.util.*;
public class Main {
	public static void main(String[]args)
	{
		Scanner sc= new Scanner (System.in);
		ArrayList<Employees>emp= new ArrayList<>();
		 System.out.println("Enter number of Employees");
		 int numEmp= sc.nextInt();sc.nextLine();
		 
		 for(int i=0;i<numEmp;i++)
		 {
			 System.out.println("Enter  id");
			 int id= sc.nextInt();
			 sc.nextLine();
			 
			 System.out.println("Enter name");
			 String name=sc.nextLine();
			 
			 System.out.println("Enter branch");
			 String branch= sc.nextLine();
			 
			 System.out.println("Enter rating ");
			 double rating= sc.nextDouble();
			 
			 System.out.println("Enter type transport");
			 boolean typetasport= sc.nextBoolean();
			 sc.nextLine();
			 
			 emp.add(new Employees(id,name,branch,rating,typetasport));
		 }
		 System.out.println("Enter data");
		 String data= sc.nextLine();
		 int count =Employees. findCountEmpusingTransport(emp,data);
		 System.out.println(count);
		 ArrayList<Employees>newList= new ArrayList<>();
		 newList.addAll(Employees.findEmployeeWithSecondHighestRating(emp));
		 for(Employees empdata:newList)
		 {
			 System.out.println(empdata.empID+" ,"+empdata.name);
		 }
		 
		 
	}

}
