package com.xworkz.controlStaments;

public class Divisibility {

	public static void main(String[] args) {
		
		int p[]= {20,30,14,18,19,35,60,8,6,10,14,12,16,19,36,38,55,58,32,89};
		
		for (int i =0; i<p.length; i++)
			
			if (p[i]%2==0)
				
			{
				System.out.println("divisible by two number:" +p[i]);
			}

	}

}
