package com.maxi.c05;

public class Link {

	public int iData;
	public double dData;
	public Link next;

	public Link(int id, double dd) {
		iData = id;
		dData = dd;
	}

	public void dispalyLink() {
		System.out.println("{" + iData + " , " + dData + "}");

	}

}
