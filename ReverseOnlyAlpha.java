package com.learn.programs;

public class ReverseOnlyAlpha {

	public static void main(String args[]) {
		String[] arr = {"a","#","@","l","*","w","j","c","%"};
		
	// Logic
	//  if front is not alpha increment it
	// 	else if back is not alpha increment it
	//  else tarverse both side and if front and back is Alpha then swap and increment and decrement both sides 
		
		int len = arr.length;
		int front=0;int last=arr.length-1;
		String temp = "";
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		while(front<last) {
			if(!arr[front].matches("^[a-zA-Z0-9]*$")) {
				front++;
			}else if(!arr[last].matches("^[a-zA-Z0-9]*$")){
				last--;
			}else {
				temp = arr[front];
				arr[front] = arr[last];
				arr[last] = temp;
				front++;
				last--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
