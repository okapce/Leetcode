package com.example.demo.easy;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0; i < k; i++) {
			if(nums[i]==val) {
				nums[i]=nums[k-1];
				k--;
			}
		}
        return k;
    }
}
