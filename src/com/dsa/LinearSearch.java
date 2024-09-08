package com.dsa;

public class LinearSearch {
	public static void main(String[] args) {
		int [] nums= {5,6,8,9,11};
		int target=9;
		int result=linearSearch(nums,target);
		if(result!=-1)
			System.out.println("Index found at: "+result);
		else
			System.out.println("Element not found");
	}

	private static int linearSearch(int[] nums, int target) {

		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target)
				return i;
		}

		return -1;
	}

}
