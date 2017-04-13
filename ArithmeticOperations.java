package com.leet.www;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArithmeticOperations {
	public static void main(String[] args)
	{
		System.out.println(ArithmeticOperations.getSum(4, 6));
		System.out.println(ArithmeticOperations.getDifference(4, 6));
		System.out.println(ArithmeticOperations.subtract(4, 6));
		HashMap<String,String> temp = new HashMap<String,String>();
		List<String> newtemp = (List<String>) temp.values();
		int[] x = new int[10];
		List<Integer> result = new ArrayList<Integer>();
		//result.addAll(x);
		result.rem
	}
	
	public static int getSum(int a, int b)
	{
		if (b==0) return a;
		int carry = a&b;
		int sum = a^b;
		return getSum(sum,carry<<1);
	}
	
	public static int getDifference(int a, int b)
	{
		if (b==0)
			return a;
		int diff1 = a^b;
		int borrow1 = (~a&b);
		return getDifference(diff1,borrow1<<1);
	}
	
	static int subtract(int x, int y)
	{
	    if (y == 0)
	        return x;
	    int diff = x^y;
	    int borr = ~x & y;
	    return subtract(diff, borr<<1);
	}
	

}
