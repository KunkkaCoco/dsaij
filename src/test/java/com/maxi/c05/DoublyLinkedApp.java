package com.maxi.c05;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DoublyLinkedApp {

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
		DoubleLinkedList theList = new DoubleLinkedList();

		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);

		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);

		theList.displayForward();
		theList.displayBackward();

		theList.deleteFirst();
		theList.deleteLast();
		theList.deleteKey(11);

		theList.displayForward();

		theList.insertAfter(22, 77);
		theList.insertAfter(11, 88);
		theList.displayForward();
	}

}
