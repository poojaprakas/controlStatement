package com.xworkz.controlStaments;

public class RoadTax {

	public static void main(String[] args) {
		int Price = 15000;
		double taxAmount;
		String states ="karnataka";
		if(states=="karnataka")
		{
		taxAmount = Price*0.5/100;
		System.out.println("tax Amount is " + taxAmount);
		}
		else if (states=="kerala")
		{
			taxAmount = Price*0.8/100;
			System.out.println("tax amount is" + taxAmount);
		}
		else if (states=="chennai")
		{
			taxAmount = Price*0.12/100;
			System.out.println("tax amount is" + taxAmount);
		}
		else if (states=="assam")
		{
			taxAmount = Price*0.15/100;
		System.out.println("tax amount is" + taxAmount);
		}

	}

}
