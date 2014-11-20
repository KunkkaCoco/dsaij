package com.maxi.c04;

public class IntStack {
	private int maxiSize;
	private int[] stackArray;
	private int top;

	public IntStack(int s) {
		maxiSize = s;
		stackArray = new int[maxiSize];
		top = -1;
	}

	public void push(int j) {
		if (!isFull()) {
			stackArray[++top] = j;
		}
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception(" stack  is  empty!");
		}
		return stackArray[top--];
	}

	public int peek() {
		return stackArray[top];
	}

	public int size() {
		return top + 1;
	}

	public int peekN(int n) {
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