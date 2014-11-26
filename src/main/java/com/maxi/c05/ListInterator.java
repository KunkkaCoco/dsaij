package com.maxi.c05;

public class ListInterator {

	private Link1 current;
	private Link1 previous;
	private LinkList1 ourList;

	public ListInterator(LinkList1 list) {
		ourList = list;
		reset();
	}

	public void reset() {
		current = ourList.getFrist();
		previous = null;
	}

	public boolean atEnd() {
		return current.next == null;
	}

	public void nextLink() {
		previous = current;
		current = current.next;
	}

	public Link1 getCurrent() {
		return current;
	}

	public void insertAfter(long dd) {
		Link1 newLink = new Link1(dd);
		if (ourList.isEmpty()) {
			ourList.setFirst(newLink);
			current = newLink;
		} else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink();

		}

	}

	public void insertBefore(long dd) {
		Link1 newLink = new Link1(dd);
		if (previous == null) {
			newLink.next = ourList.getFrist();
			ourList.setFirst(newLink);
			reset();
		} else {
			newLink.next = current;
			previous.next = newLink;
			current = newLink;
		}
	}

	public long deleteCurrent() {
		long value = current.dData;

		if (previous == null) {
			ourList.setFirst(current.next);
			reset();
		} else {
			previous.next = current.next;
			if (atEnd()) {
				reset();
			} else {
				current = current.next;
			}
		}

		return value;
	}

}
