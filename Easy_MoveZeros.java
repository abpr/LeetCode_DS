package com.leet.www;

public class Easy_MoveZeros {
	public void moveZeroes(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        while(p1<= nums.length-2 && p2<=nums.length-1){
                if(p2<=nums.length-1){
                if(nums[p1]==0 && nums[p2] == 0){
                    p2++;
                }
                else if(nums[p1] != 0 && nums[p2] != 0){
                    p1++;
                    p2++;
                }
                else if(nums[p1] == 0 && nums[p2]!= 0){
                    int temp = nums[p2];
                    nums[p2] = nums[p1];
                    nums[p1] = temp;
                }
                else if(nums[p1] != 0 && nums[p2]== 0){
                    p1++;
                    p2++;
                }
            }
            else
                break;
                
        }
        System.out.println(nums);
        
    }
}
