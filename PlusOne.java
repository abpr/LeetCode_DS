package com.leet.www;

import java.math.BigInteger;

public class PlusOne {
	 public int[] plusOne(int[] digits) {
	        if (digits.length == 0)
	            return digits;
	        else
	        {
	            int number = 0;
	            //get the digits of the array and convert to a number
	            for(int i=0;i<digits.length;i++)
	            {
	                number =  (int) ((int) Math.pow(10,i) + digits[i]);
	            }
	            
	            System.out.println(number);
	            return digits;
	        }
	    }

}
