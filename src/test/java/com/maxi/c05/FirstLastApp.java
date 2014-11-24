package com.maxi.c05;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstLastApp {
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
		FirstLastList theList = new FirstLastList();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(55);
		theList.insertFirst(66);

		theList.insertLast(77);
		theList.insertLast(88);
		theList.insertLast(99);

		theList.displayList();

		theList.deleteFirst();
		theList.deleteFirst();

		theList.displayList();
	}

}
