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

//package com.leetcode.www;

public class MissingNumber2 {
	
	public static void main(String[] args){
		int a[] = {1,2,4,5,6};
	    int miss = getMissingNo(a);
	    System.out.println(miss);
	    numSetBits(3l);
	}
	
	public static int getMissingNo(int[] arr){
		if(arr == null)
			return 0;
		int x1 = arr[0], x2 = 1, res3 = 0;
		 for (int i = 1; i< arr.length; i++)
		        x1 = x1^arr[i];
		            
		    for (int i = 2; i <= arr.length+1; i++)
		        x2 = x2^i;         
		    
		    return (x1^x2);
	}
	
	public static int numSetBits(long a) {
	    String binary = Integer.toBinaryString((int)a);
	    System.out.println(binary);
	    int count = 0;
	    for(int i=0;i<binary.length();i++)
	    {	if(binary.charAt(i) == '1')
	    		count++;
	    }
	    System.out.println(count);
	    return count;
	}

}

