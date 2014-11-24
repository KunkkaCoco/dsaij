package com.maxi.c05;

class Linkd {

	public long dData;
	public Linkd next;

	public Linkd(long d) {
		dData = d;
	}

	public void dispalyLink() {
		System.out.println(dData + " ");
	}
}

public class FirstLastList {

	private Linkd first;

	private Linkd last;

	public FirstLastList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(long dd) {
		Linkd newLink = new Linkd(dd);
		if (isEmpty()) {
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}

	public void insertLast(long dd) {
		Linkd newLinkd = new Linkd(dd);
		if (isEmpty()) {
			first = newLinkd;
		} else {
			last.next = newLinkd;
		}
		last = newLinkd;
	}

	public long deleteFirst() {

		long temp = first.dData;
		if (first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.println("first --> last : ");
		Linkd current = first;
		while (current != null) {
			current.dispalyLink();
			current = current.next;
		}
		System.out.println("==============");

	}

}
