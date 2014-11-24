package com.maxi.c05;

public class DoubleLinkedList {

	private DoubleLink first;
	private DoubleLink last;

	public DoubleLinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(long dd) {
		DoubleLink newLink = new DoubleLink(dd);
		if (isEmpty()) {
			last = newLink;
		}
	}
}
