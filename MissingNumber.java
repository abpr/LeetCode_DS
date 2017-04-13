package com.leet.www;
/*


Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.
*/
public class MissingNumber {
	
	public int missingNumber(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            if(nums[0] != 0)
                return 0;
            else
                return nums[0]+1;
        int retVal = 0;
        //find the max number
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }
        }
        int maximum = Math.max(max+1, nums.length+1);
        System.out.println(maximum);
        int[] temp = new int[maximum];
        for(int i = 0;i< nums.length ; i++){
            temp[nums[i]] = 1;
        }
        for(int i = 0;i< temp.length ; i++){
            //System.out.println(temp[i]);
            if(temp[i]!=1)
                retVal = i;
        }
        return retVal;
    }

}
