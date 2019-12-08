package com.learn.programs;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		Integer max = Integer.MAX_VALUE;
		Integer min = Integer.MIN_VALUE;
		
		int[] arr = {5,4,76,32,65,4,7,987,1,3,9,-5};
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > min) {
				min = arr[i];//min = 5,76,
			}
		}for(int i=0;i<arr.length;i++) {
			if(arr[i] < max) {
				max = arr[i];//min = 5,76,
			}
		}
		System.out.println("max number present in array is : " + min);
		System.out.println("min number present in array is : " + max);
	}
}
