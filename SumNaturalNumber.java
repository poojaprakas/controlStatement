package com.xworkz.controlStaments;

public class SumNaturalNumber {

	public static void main(String[] args) {
		int sum = 0 , num = 10;
		System.out.println("enter the integer number");
		int i = 1;
		do
		{
			sum+=i;
			i++;
		}while (i<=num);
		System.out.println("sum of natural numbers:" +sum);
	}
}
