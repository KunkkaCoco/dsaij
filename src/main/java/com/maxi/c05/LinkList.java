package com.maxi.c05;

public class LinkList {

	private Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.println("first --> last : ");
		Link current = first;
		while (current != null) {
			current.dispalyLink();
			current = current.next;
		}
		System.out.println("==============");

	}
}
