package com.maxi.c05;

public class LinkList1 {

	private Link1 first;

	public LinkList1() {
		first = null;
	}

	public Link1 getFrist() {
		return first;
	}

	public void setFirst(Link1 f) {
		first = f;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public ListInterator getIterator() {
		return new ListInterator(this);
	}

	public void displayList() {

		Link1 current = first;
		while (current != null) {
			current.dispalyLink();
			current = current.next;
		}

	}
}
