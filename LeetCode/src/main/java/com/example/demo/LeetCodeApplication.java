package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.easy.CountGoodRectangles;
import com.example.demo.easy.ImplementStr;
import com.example.demo.easy.SearchInsert;
import com.example.demo.medium.CombinationSum;

@SpringBootApplication
public class LeetCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeetCodeApplication.class, args);
		
		
		// Combination Sum
//		int candidates[] = {2,3,5}, target = 8;
//		CombinationSum combinationSum = new CombinationSum();
//		List<List<Integer>> list = new ArrayList<List<Integer>>();
//		list = combinationSum.combinationSum(candidates, target);
//		
//		System.out.println("the list: "+list);
//		
		// Implement Str
//		String haystack = "human";//"hello";
//		String needle = "an";
//		ImplementStr implementStr = new ImplementStr();
//
//		int result = implementStr.strStr(haystack, needle);
//		System.out.println("Implement Str is at :"+result);
		
		// Remove Element
        
    
		
		// SearchInsert
//		int nums[] = {1,3,5,6}, target = 5;
//		
//		SearchInsert searchInsert = new SearchInsert();
//		int output = searchInsert.searchInsert(nums, target);
//		
//		System.out.println("output should be 2 and it's: "+output);
		
		// Rectangles 
//		int[][] rectangles = {
//				{2,5},
//				{2,5},
//				{4,2},
//				{3,5}
//		};
//		CountGoodRectangles countGoodRectangles = new CountGoodRectangles();
//		int count = countGoodRectangles.countGoodRectangles(rectangles);
//		System.out.println("there are "+count+" rectangles");
	}

}
