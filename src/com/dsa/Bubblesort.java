package com.dsa;

public class Bubblesort {

	public static void main(String[] args) {
		int[] nums= {4,6,4,2,3,4};
		int temp=0;


		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}

		for(int numbers:nums) {
			System.out.print(numbers+" ");
		}


	}

}
