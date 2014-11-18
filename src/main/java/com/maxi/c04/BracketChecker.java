package com.maxi.c04;

public class BracketChecker {

	private String input;
	private String output;

	public BracketChecker(String in) {
		input = in;
	}

	public String check() throws Exception {
		int stackSize = input.length();
		Stackx1 theStack = new Stackx1(stackSize);

		for (int j = 0; j < input.length(); j++) {

			char chat = input.charAt(j);
			switch (chat) {
			case '{':
			case '[':
			case '(':
				theStack.push(chat);
				break;
			case '}':
			case ']':
			case ')':
				if (!theStack.isEmpty()) {
					char chx = theStack.pop();
					if (chat == '}' && chx != '{') {
						System.out.println("Error:" + chat + " at " + j);
					}
					if (chat == ']' && chx != '[') {
						System.out.println("Error:" + chat + " at " + j);
					}
					if (chat == '(' && chx != '(') {
						System.out.println("Error:" + chat + " at " + j);
					}
				} else {
					System.out.println("Error:" + chat + " at " + j);
				}
				break;
			default:
				break;

			}
		}

		if (!theStack.isEmpty()) {
			System.out.println("Error : missing right delimiter");
		}
		output = "";

		while (!theStack.isEmpty()) {
			char ch = theStack.pop();
			output = output + ch;
		}
		return output;

	}
}
