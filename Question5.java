// Sreeman Tummala
// sxt190060
// Section 003



package com.javaguides.java.functionalinterfaces;
import java.util.function.Function;
import java.lang.*;

public class Question5 {
	
	// This is my code for number 5
	// Sreeman Tummala

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Double,Double> function = (t) -> (t-1.5)*(t-1.5)*(t-1.5);

		System.out.println(FindXintc(function,-10,19));
		
		
	

		
	}
	public static double FindXintc(Function<Double,Double> func, double low, double high)
	{
	
		double mid = 0;
		// This is where I use the binary search to find the roots
		
		while(low <= high)
		{
			mid = (low + high)/2;
			if(func.apply(mid) == 0)
			{
				return mid;
			}
			else if(func.apply(mid)>0)
			{
				high = mid ;
			}
			else {
				low = mid ;
			}
		}

		return mid;
		
	}

}
