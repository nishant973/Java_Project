package com.learn.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Missing number 1 to 100
public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("Entered number by user is  : " + input);
		List<Integer> numbers = new ArrayList<Integer>();
		Integer n = new Integer(1);
		for(int i=0;i<input;i++) {
			numbers.add(n+i);
		}
		numbers.remove(input-3);//removing number from index
		System.out.println(numbers);
		
		int sum = 0;
		sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
		
		
		/*
		 * for(int i=0;i<numbers.size();i++) { sum = sum + numbers.get(i); }
		 */
		System.out.println(sum);
		
		int missingNumber = (input * (input+1))/2 - sum;
		
		System.out.println("missing number is : " + missingNumber);
		
	}
}
