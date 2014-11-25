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
		} else {
			first.previous = newLink;
		}
		newLink.next = first;
		first = newLink;
	}

	public void insertLast(long dd) {
		DoubleLink newLink = new DoubleLink(dd);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
		}
		newLink.previous = last;
		last = newLink;

	}

	public DoubleLink deleteFirst() {
		DoubleLink link = first;
		if (link.next == null) {
			last = null;
		} else {
			link.next.previous = null;
		}
		first = link.next;
		return link;
	}

	public DoubleLink deleteLast() {
		DoubleLink link = last;
		if (link.previous == null) {
			first = null;
			last = null;
		} else {
			last = link.previous;
			link.previous.next = null;
		}
		return link;
	}

	public boolean insertAfter(long key, long dd) {
		DoubleLink current = first;
		while (current.dData != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}
		DoubleLink newLink = new DoubleLink(dd);
		if (current.next == null) {
			newLink.next = null;
			last = newLink;
		} else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		return true;

	}

	public DoubleLink deleteKey(long key) {
		DoubleLink current = first;
		while (current.dData == key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}
		if (current == first) {
			first = first.next;
		} else {
			current.previous.next = current.next;
		}
		if (current == last) {
			last = last.previous;
		} else {
			current.next.previous = current.previous;
		}

		return current;
	}

	public void displayForward() {
		System.out.println("First --> last : ");
		DoubleLink current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
	}

	public void displayBackward() {
		System.out.println("last --> first : ");
		DoubleLink current = last;
		while (current != null) {
			current.displayLink();
			current = current.previous;
		}
	}
}
