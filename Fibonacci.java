package com.learn.programs;

public class Fibonacci {

	public static void main(String[] args) {
		int sequence = 50;
		int start=0,start1=1;
		int sum = 0;
		System.out.print(start);
		for(int i=2;i<sequence;i++) {
			sum = start + start1;
			start1 = start;
			start = sum;
			System.out.print(" ");
			System.out.print(sum);
		}

	}

}
