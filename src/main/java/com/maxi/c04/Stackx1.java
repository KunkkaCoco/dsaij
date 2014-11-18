package com.maxi.c04;

public class Stackx1 {
	private int maxiSize;
	private char[] stackArray;
	private int top;

	public Stackx1(int s) {
		maxiSize = s;
		stackArray = new char[maxiSize];
		top = -1;
	}

	public void push(char j) {
		stackArray[++top] = j;
	}

	public char pop() {
		return stackArray[top--];
	}

	public char peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == maxiSize - 1;
	}

}