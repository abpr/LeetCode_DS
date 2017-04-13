package com.leet.www;

import java.util.ArrayList;

public class CombinationSum {
	public static void main(String[] args)
	{
		int a = 0;
		a = 23;
		Integer.toBinaryString(a);
		Integer.bitCount(a);
		char b1 = '0';
		char b2 = '9';
		
		System.out.println((int) b1 < 9);
		System.out.println((int) b1);
		System.out.println((int) b2);
		String x = "Afdsf";
		System.out.println(new StringBuilder(x).reverse().toString());
		ArrayList<Integer[]> visited = new ArrayList<Integer[]>();
		Integer[] p1 = {1,2};
		Integer[] p2 = {1,3};
		visited.add(p1);
		visited.add(p2);
		System.out.println(visited.contains(p1));
		Integer[] sam = visited.get(0);
		System.out.println(sam[0]+" "+sam[1]);
	}

}
