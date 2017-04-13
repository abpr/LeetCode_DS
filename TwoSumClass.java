package com.leet.www;

import java.util.HashSet;
import java.util.Set;

public class TwoSumClass {
	public static void main(String[] args)
	{
	/*	Set<Character> myset = new HashSet<Character>();
		myset.add('c');
		System.out.println(myset);
		System.out.println(myset.contains('v'));
		int x = 9;
		System.out.println(-x);
	*/
		String bigString = "gooogle";
		String smallString = "oog";
		char startP = smallString.charAt(0);
		int resStart = 0;
		for(int i=0;i<bigString.length();i++)
		{
			int k = 0;
			if(bigString.charAt(i) == startP)
			{
				resStart  = i;
			while(bigString.charAt(i) == startP){
				//
				
				startP = smallString.charAt(k++);
				i++;
				
			}
			i = resStart;
			}
			System.out.println(resStart);
		}
	}
}
