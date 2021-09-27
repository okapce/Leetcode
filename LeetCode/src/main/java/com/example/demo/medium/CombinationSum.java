package com.example.demo.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		backTrack(candidates, 0, target, new ArrayList<Integer>(), resultList);
//		List<List<Integer>> intList = new ArrayList<List<Integer>>();
//		for (int i = 0; i < candidates.length; i++) {
//			int j = candidates[i];
//			int remain = target - j;
//			if(remain==0) {
//				resultList.add(j);
//				intList.add(resultList);
//				break;
//			}else if(remain > 0) {
//				resultList.add(j);
//				target = remain;
//			}
//		}
	
		return resultList;
    }
	
	public void backTrack(int[] candidates, int start, int target, List<Integer> tempList, List<List<Integer>> result) {
		if(target<0) {
			return;
		}
		if(target == 0) {
			result.add(tempList);
		}
		for (int i = start; i < candidates.length; i++) {
			tempList.add(candidates[i]);
			backTrack(candidates, i, target - candidates[i], tempList, result);
			tempList.remove(tempList.size()-1);
		}
	}
}
