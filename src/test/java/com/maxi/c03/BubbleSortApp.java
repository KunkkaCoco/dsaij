package com.maxi.c03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BubbleSortApp {

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

		int maxSize = 100;
		ArrayBub arr;
		arr = new ArrayBub(maxSize);

		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);

		arr.display();

		arr.bubbleSort();
		arr.display();

		System.out.println("After test() test##########################################################");
	}

	@Test
	public void test2() {

		int maxSize = 100;
		ArrayBub arr;
		arr = new ArrayBub(maxSize);

		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.insert(75);

		arr.display();

		arr.bubbleSort2();
		arr.display();
	}

}
