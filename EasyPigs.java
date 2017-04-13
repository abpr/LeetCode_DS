package com.leet.www;

public class EasyPigs {
	
	    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
	        //now if they are not equal
	        // if you have 1 hr time and 15mins time to die upon consumption - we have 4 rounds
	        int rounds = minutesToTest/ minutesToDie + 1;
	        return (int) Math.ceil(Math.log10(buckets)/Math.log10(rounds));
	    }
	

}
