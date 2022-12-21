package com.Part1;

public class twoSum {

	public static void main(String[] args) {
		twoSum ts = new twoSum();
		int[] arr = { 2,5,5,11 };
		int target = 10;

		System.out.println(ts.twoSum(arr, target));

	}

	public int[] twoSum(int[] nums, int target) {

		int arr[] = new int[2];

		
			for (int i = 0; i < nums.length; i++) {
				for (int j = 1; j < nums.length; j++) {

					if (nums[i] + nums[j] == target && i != j) {
						arr[0] = i;
						arr[1] = j;
//						System.out.println(1);

					    return arr;

					}
				}

			
		}
		
		return arr;

	}
}
