package com.xworkz.controlStaments;

public class DivisionOfTwo {

	public static void main(String[] args) {
		
		int q[] = {22,34,56,78,3,5,9,6,8,10,33,23,16,78,90,88,87,76,55,45};
		
		for (int i=0; i<q.length; i++)
			
			if (q[i]%2==0)
			{
				System.out.println("divisible by two number:" +q[i]);
			}

	}

}
