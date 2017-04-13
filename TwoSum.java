package com.leet.www;

import java.util.HashMap;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.
 * 
 * */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
	        int[] single = {0};
	        int[] empty = {};
	        if(nums.length == 0)
	            return nums;
	        if(nums.length==1 && nums[0] == target)
	            return single;
	        for(int i=0;i<nums.length;i++){
	            tracker.put(target - nums[i],i);
	        }
	        for(int i=0; i<nums.length;i++){
	            if(tracker.containsKey(nums[i]) && (tracker.get(nums[i])!=i) )
	                return new int[] {i,tracker.get(nums[i])};
	        }
	        return empty;
	    }
}
