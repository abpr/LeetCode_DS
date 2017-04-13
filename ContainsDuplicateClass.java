package com.leet.www;

import java.util.HashMap;

public class ContainsDuplicateClass {
	    public boolean containsDuplicate(int[] nums) {
	        HashMap<Integer,Integer> duplicateChecker = new HashMap<Integer,Integer>();
	        for(int i = 0; i<nums.length; i++)
	        {
	            if(duplicateChecker.containsKey(nums[i]) == true)
	                return true;
	            else
	                duplicateChecker.put(nums[i],1);
	        }
	        return false;
	        
	    }

}
