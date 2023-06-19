package com.Week1;

import com.Part1.twoSum;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]

//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]

public class Two_Sum {

	public static void main(String[] args) {
		twoSum ts = new twoSum();
		int[] arr = { 2, 5, 5, 11 };
		int target = 10;
		int[] arr1 = ts.twoSum(arr, target);
		for (int i : arr1) {
			System.out.println(arr[i]);
			
		}
		
	}

	public int[] twoSum(int[] nums, int target) {

		int arr[] = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target && i != j) {
					arr[0] = i;
					arr[1] = j;

				}
			}
		}
		return arr;
	}
}