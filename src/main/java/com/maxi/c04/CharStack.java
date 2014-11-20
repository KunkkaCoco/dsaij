package com.maxi.c04;

public class CharStack {
	private int maxiSize;
	private char[] stackArray;
	private int top;

	public CharStack(int s) {
		maxiSize = s;
		stackArray = new char[maxiSize];
		top = -1;
	}

	public void push(char c) {
		if (!isFull()) {
			stackArray[++top] = c;
		}
	}

	public char pop() throws Exception {
		if (isEmpty()) {
			throw new Exception(" stack  is  empty!");
		}
		return stackArray[top--];
	}

	public char peek() {
		return stackArray[top];
	}

	public int size() {
		return top + 1;
	}

	public char peekN(int n) {
		return stackArray[n];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == maxiSize - 1;
	}

	public void displayStack(String s) {
		System.out.println(s);
		System.out.print("Stack (bottom -- > top ): ");
		for (int i = 0; i < size(); i++) {
			System.out.print(peekN(i));
			System.out.print("  ");
		}
		System.out.println("");
	}

}