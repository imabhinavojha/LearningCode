package com.array;

public class removeDuplicateFromSortedArray {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		removeDuplicateFromSortedArray obj = new removeDuplicateFromSortedArray();
		obj.removeDuplicates(arr);

	}

	public int removeDuplicates(int[] nums) {
		int length = nums.length;
		int uniqueArr[] = new int[length];
		int uniqueCount = 0;
		for (int i = 0; i < length; i++) {
			boolean isDuplicate = false;
			for (int j = i+1; j < length; j++) {
				if (nums[i] == nums[j]) {
					isDuplicate = true;
					break;
				}
				
			}
			if (!isDuplicate) {
				uniqueArr[uniqueCount++] = nums[i];
			}
			
		}
		for (int i : uniqueArr) {
			System.out.print(i+" ");
			
		}
		
		
		return 0;
	}
}
