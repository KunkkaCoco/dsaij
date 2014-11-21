package com.maxi.c05;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkListApp {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before test##############################################################");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass test##########################################################");
	}

	@Test
	public void test() throws Exception {
		LinkList theList = new LinkList();
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 3.99);
		theList.insertFirst(55, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(77, 5.99);
		theList.insertFirst(88, 8.99);

		theList.displayList();

		while (!theList.isEmpty()) {
			Link aLink = theList.deleteFirst();
			System.out.println("Deteled ");
			aLink.dispalyLink();
			System.out.println("");
		}

		theList.displayList();
	}
}
