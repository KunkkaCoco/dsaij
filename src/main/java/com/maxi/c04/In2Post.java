package com.maxi.c04;

public class In2Post {

	private CharStack theStack;
	private String input = "";
	private String output = "";

	public In2Post(String s) {
		input = s;
		int stackSize = input.length();
		theStack = new CharStack(stackSize);
	}

	public String doTrans() throws Exception {
		for (int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			theStack.displayStack("For " + ch + " ");
			switch (ch) {
			case '+':
			case '-':
				gotOper(ch, 1);
				break;
			case '*':
			case '/':
				gotOper(ch, 2);
				break;
			case '(':
				theStack.push(ch);
				break;
			case ')':
				gotParen(ch);
				break;
			default:
				output = output + ch;
				break;
			}
		}

		while (!theStack.isEmpty()) {
			theStack.displayStack("while ");
			output = output + theStack.pop();
		}
		theStack.displayStack("End ");
		return output;
	}

	public void gotOper(char opThis, int prec1) throws Exception {
		while (!theStack.isEmpty()) {
			char opTop = theStack.pop();
			if (opTop == '(') {
				theStack.push(opTop);
				break;
			} else {
				int prec2;
				if (opTop == '+' || opTop == '-') {
					prec2 = 1;
				} else {
					prec2 = 2;
				}

				if (prec2 < prec1) {
					theStack.push(opTop);
					break;
				} else {
					output = output + opTop;
				}
			}
		}
		theStack.push(opThis);
	}

	public void gotParen(char ch) throws Exception {
		while (!theStack.isEmpty()) {
			char chax = theStack.pop();
			if (chax == '(') {
				break;
			} else {
				output = output + chax;
			}
		}
	}
}
