package com.tcs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[]args)
	{Scanner sc= new Scanner(System.in);
	ArrayList<Medicine>medi=new ArrayList<>();
	System.out.println(" Input tkae");
	int takenum=sc.nextInt();sc.nextLine();
	while(takenum!=0)
	{
		System.out.println("takemedicene name");
		String takemediName= sc.nextLine();
		System.out.println("takemedicene batch");
		String take_batchName=sc.nextLine();
		System.out.println("takemedicene disease");
		String disease= sc.nextLine();
		System.out.println("takemedicene price");
		int price= sc.nextInt();sc.nextLine();
		medi.add(new Medicine(takemediName,take_batchName,disease,price));
	 takenum--;	
	}
	
	System.out.println("enter seach price of disease");
	String search_disease= sc.nextLine();
	ArrayList<Medicine>filterMedicene= new ArrayList<>();
	
	filterMedicene.addAll(Medicine.getPriceByDiseas(medi, search_disease));
	
	for(Medicine medicine:filterMedicene)
	{
		System.out.println(medicine.price);
	}
	}

}
