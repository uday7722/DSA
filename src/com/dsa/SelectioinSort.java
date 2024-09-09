package com.dsa;

public class SelectioinSort {
	
	public static void main(String[] args) {
		int[] nums= {4,6,4,2,3,4};
		int temp=0;
		int minIndex=-1;
		
		for(int i=0;i<nums.length-1;i++) {
			minIndex=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[minIndex]>nums[j]) {
					minIndex=j;
				}
			}
			
			temp=nums[minIndex];
			nums[minIndex]=nums[i];
			nums[i]=temp;
			
		}
		
		for(int numbers:nums) {
			System.out.print(numbers+" ");
		}
		
		
		
		
	}
}
