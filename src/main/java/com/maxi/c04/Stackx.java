package com.maxi.c04;

public class Stackx {
	private int maxiSize;
	private long[] stackArray;
	private int top;

	public Stackx(int s) {
		maxiSize = s;
		stackArray = new long[maxiSize];
		top = -1;
	}

	public void push(long j) {
		if (!isFull()) {
			stackArray[++top] = j;
		}
	}

	public long pop() throws Exception {
		if (isEmpty()) {
			throw new Exception(" stack  is  empty!");
		}
		return stackArray[top--];
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == maxiSize - 1;
	}

}