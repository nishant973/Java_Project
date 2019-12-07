package com.learn.programs;

import java.util.Stack;

public class WellFormedBraces {

	public static void main(String args[]) {
		String input = "{)";
		boolean flag = false;
		Stack stack = new Stack();
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) == '{' || input.charAt(i) == '[' 
					|| input.charAt(i) == '(') {
				stack.push(input.charAt(i));
			}else {
				flag = braceBalance((Character) stack.pop() , input.charAt(i));
				if(!flag) {
					System.out.println("Not a Well Formed braces");
					return;
				}
			}
		}
		if(flag && stack.isEmpty()) {
			System.out.println("Well Formed braces");
		}else {
			System.out.println("Not a Well Formed braces");
		}
	}

	private static boolean braceBalance(Character pop, char charAt) {
		if(pop == '{' && charAt == '}') {
			return true;
		}else if(pop == '[' && charAt == ']') {
			return true;
		}else if(pop == '(' && charAt == ')') {
			return true;
		}
		return false;
	}
}
