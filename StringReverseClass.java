package com.leet.www;

public class StringReverseClass {

	public String reverseString(String s) {
	        if (s.equals(""))
	            return s;
	        char[] temp = s.toCharArray();
	        int n = temp.length-1;
	        for(int i=0;i<n/2+1 ; i++){
	            char c = temp[i];
	            temp[i] = temp[n-i];
	            temp[n-i] = c;
	        }
	        String res = new String(temp);
	        //if(temp.length%2 != 0)  res+= Character.toString(temp[0]);
	        return res;
	        
	    }
}
