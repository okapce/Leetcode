package com.example.demo.easy;

public class SearchInsert {
	public int searchInsert(int[] nums, int target) {
		int result = 0;
        for(int i =0;i<=nums.length;i++){
            if(nums[i]==target){
            	result= i;
            	break;
            }else if(i-1<0) {
            	continue;
            }else if(nums[i-1]<target && nums[i]>target){
                result = i;
                break;
            }  
        }
		return result;
    }
}
