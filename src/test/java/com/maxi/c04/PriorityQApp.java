package com.maxi.c04;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PriorityQApp {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before test##############################################################");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass test##########################################################");
	}

	@Test
	public void test() {
		PriorityQ thePQ = new PriorityQ(10);
		thePQ.insert(30);
		thePQ.insert(40);
		thePQ.insert(10);
		thePQ.insert(60);
		thePQ.insert(70);
		thePQ.insert(20);

		System.out.println("thePQ peekMin  : " + thePQ.peekMin());
		while (!thePQ.isEmpty()) {
			long item = thePQ.pop();
			System.out.println(item);

		}

	}
}
