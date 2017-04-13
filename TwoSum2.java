package com.leet.www;

import java.util.HashMap;
/*
 * 
 * 
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

 * 
 * */
public class TwoSum2 {
	    public int[] twoSum(int[] numbers, int target) {
	        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
	        int[] single = {0};
	        int[] empty = {};
	        if(numbers.length == 0)
	            return numbers;
	        if(numbers.length==1 && numbers[0] == target)
	            return single;
	        for(int i=0;i<numbers.length;i++){
	            tracker.put(target - numbers[i],i);
	        }
	        for(int i=0; i<numbers.length;i++){
	            if(tracker.containsKey(numbers[i]) && (tracker.get(numbers[i])!=i) )
	                return new int[] {i+1,tracker.get(numbers[i])+1};
	        }
	        return empty;
	    }

}
