package com.tcs;
import java.util.*;
public class Medicine {
	public String medicine;
	public String batch;
	public String disease;
	public int price;
	 
	public Medicine (String medicine,String batch, String  disease,int price)
	{
		this.medicine=medicine;
		this.batch=batch;
		 this.disease=disease;
		 this.price=price;
	}
	
	 public static ArrayList<Medicine> getPriceByDiseas(ArrayList<Medicine>medicineList,String searchdisease)
	 {
		 ArrayList<Medicine>filtermedicine=new ArrayList<>();
		 
	 for(Medicine medi:medicineList)
		 {
			 if(medi.disease.equalsIgnoreCase(searchdisease))
			 {
				filtermedicine.add(medi);
			 }
		 }
		 return filtermedicine;
	 }
	
}
