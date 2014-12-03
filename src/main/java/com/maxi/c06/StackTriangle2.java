package com.maxi.c06;

import java.io.IOException;

import com.util.StringUtil;

public class StackTriangle2 {

	static int theNumber;
	static int theAnswer;
	static StackX theStack;

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a number : ");
		theNumber = StringUtil.getInt();
		stackTriangle();
		System.out.println("Triangle = " + theAnswer);
	}

	public static void stackTriangle() {
		theStack = new StackX(10000);
		theAnswer = 0;

		while (theNumber > 0) {
			theStack.push(theNumber);
			--theNumber;
		}

		while (!theStack.isEmpty()) {
			int newN = theStack.pop();
			theAnswer += newN;
		}
	}
}
