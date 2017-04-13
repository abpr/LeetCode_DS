package com.leet.www;

public class Easy_PalindromeNumber {
	public static void main(String[] args){
		System.out.println(isPalindrome(21344235));
	}
	public static boolean isPalindrome(int x) {
        if(x == 0)
            return false;
        if(x < 10)
            return true;
        String num = Integer.toString(x);
        int p1 = 0;
        int p2 = num.length()-1;
        while(p1!= p2 || p1<=p2){
            if(num.charAt(p1) != num.charAt(p2))
                return false;
            p1++;
            p2--;
        }
        return true; 
    }

}
