package com.dsa;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums= {3,6,7,9,14,57};
		int target=14;
		int result=binarySearch(nums,0,nums.length-1,target);
		if(result!=-1)
			System.out.println("Index is at position: "+result);
		else
			System.out.println("Element not found");

	}

	private static int binarySearch(int[] nums, int left, int right,int target) {
		while(left<=right) {
			int mid=(left+right)/2;

			if(nums[mid]==target) {
				return mid;
			}
			else if(mid<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}	

		return -1;
	}

}