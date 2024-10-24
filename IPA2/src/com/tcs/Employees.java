package com.tcs;

public class Employees {
	private int id;
	 private String name;
	  private String desgination;
	  private double salary;
	 
	  public Employees(int id, String name,String desgination, double salary)
	  {
		  this.id=id;
		  this.name=name;
		   this.desgination=desgination;
		   this.salary=salary;
	  }
	  public int getid()
	  {
		  return id;
	  }
	  public String getname()
	  {
		  return name;
	  }
	  public double getsalary()
	  {
		  return salary;
	  }
	  public String getdesgination() {
		  return desgination;
	  }

}
