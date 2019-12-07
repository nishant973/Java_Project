package com.java.interview.datastructure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BinarySearch {

	public static void search(
			List<Integer> numbers , int mid , int value) {
		if(value > numbers.get(mid)) {
			for(int i=mid;i<numbers.size();i++) {
				if(numbers.get(i) == value) {
					System.out.println("Searched value is found at index : " + i);
				}
			}
		}else if(value < numbers.get(mid)) {
			for(int j=0;j<mid;j++) {
				if(numbers.get(j) == value) {
					System.out.println("Searched value is found at index : " + j);
				}
			}
		}else if(numbers.get(mid) == value) {
			System.out.println("Searched value is found at index : " + mid);
		}else {
			System.out.println("Searched value is not found in list ");
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(11,3,90,45,2,12,7,89);
		numbers = numbers.stream().sorted(
				Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
		System.out.println("List after sorting : " + numbers);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you are looking for : ");
		int keyValue = sc.nextInt();
		int mid = 0 +  numbers.size() /2;
		System.out.println("mid index is :" + mid);
		search(numbers , mid , keyValue);
	}

}
