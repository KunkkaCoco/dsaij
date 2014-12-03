package com.maxi.c06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MergeSortApp {

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
		int maxSize = 100;
		Darray arr = new Darray(maxSize);

		arr.insert(64);
		arr.insert(21);
		arr.insert(33);
		arr.insert(70);
		arr.insert(12);
		arr.insert(85);
		arr.insert(44);
		arr.insert(3);
		arr.insert(9);
		arr.insert(0);
		arr.insert(108);
		arr.insert(36);

		arr.display();

		arr.mergeSort();
		arr.display();

	}

}
