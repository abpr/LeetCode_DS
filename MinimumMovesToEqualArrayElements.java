package com.leet.www;
/**
 * Given a non-empty integer array of size n, 
 * find the minimum number of moves required to make all array elements equal, 
 * where a move is incrementing n - 1 elements by 1.
 * 
 * 
 * */
import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {
	public static void main(String[] args)
	{
		int i = 1;
		System.out.println(i++);
		System.out.println(++i);
	}
	    public int minMoves(int[] nums) {
	        Arrays.sort(nums);
	        //find the diff between each element
	        int[] diff = new int[nums.length - 1];
	        for(int i=0;i<nums.length-1;i++)
	        {
	            diff[i] = nums[i+1] - nums[i];
	        }
	        System.out.println(Arrays.toString(diff));
	        int sum = 0;
	        for(int i=0;i<diff.length;i++)
	        {
	            int k=0;
	            while(k<=i)
	            {
	                sum+=diff[k];
	                k++;
	            }
	        }
	        System.out.println(sum);
	        return sum;
	    }

}
