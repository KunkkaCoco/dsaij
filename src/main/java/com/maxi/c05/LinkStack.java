package com.maxi.c05;

public class LinkStack {

	private FirstLastList theList;

	public LinkStack() {
		theList = new FirstLastList();
	}

	public void push(long j) {
		theList.insertFirst(j);
	}

	public long pop() {
		return theList.deleteFirst();
	}

	public boolean isEmpty() {
		return theList.isEmpty();
	}

	public void displayStack() {
		System.out.println("top -- > bottom : ");
		theList.displayList();
	}
}
