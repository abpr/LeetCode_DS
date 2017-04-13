package com.leet.www;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Easy_FindAnagrams {

	public static HashSet<String> setPerm= new HashSet<String>(); 
    public List<Integer> findAnagrams(String s, String p) {
    	List<Integer> res= new ArrayList<Integer>();
        System.out.println(s.charAt(0));
        String longString = s;
        String shortString = p;
        if(p == null || s==null)
            return null;
        //find the permutations of the string
        permutations("",shortString);
        //for(int i=0;i<longString.length();i++){
            
        //}
        return res;
    }
    public static void permutations(String prefix, String str){
        int n = str.length();
        if(n==0){
            System.out.println(prefix);
            //setPerm.add(str);
        }
        else{
            for(int i=0;i<n;i++){
                permutations(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n));
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutations("","sdfswrt");
	}

}
