package com.xworkz.controlStaments;

public class SumOfEvenIndex {

	public static void main(String[] args) {
		
		int p[] = {1,2,3,4,5,6};
		
		int sum = 0;
		
		for( int i =0; i<p.length; i+=2)
		{
			sum = p[i];
		}
		System.out.println(sum);
		}
			
}
