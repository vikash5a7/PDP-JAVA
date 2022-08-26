package com.epam.day4ProgramRefresh;

import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {

		String input = "[()]{}{[()()]()}";
		boolean output = balancedBrackets(input);

		if (output) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}

	private static boolean balancedBrackets(String input) {
		// TODO Auto-generated method stub
		Map<Character, Character> map = Map.of('(', ')', '[', ']', '{', '}');
		Stack<Character> stack = new Stack<>();

		for (char c : input.toCharArray()) {
			if (map.containsKey(c))
				stack.push(c);
			else if (stack.isEmpty() || map.get(stack.pop()) != c)
				return false;
		}
		return stack.isEmpty();

	}

}
