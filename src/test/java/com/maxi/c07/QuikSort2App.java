package com.maxi.c07;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuikSort2App {

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
		int maxSize = 16;

		ArrayQuick2 aq = new ArrayQuick2(maxSize);

		for (int j = 0; j < maxSize; j++) {
			long n = (int) (Math.random() * 99);
			aq.insert(n);
		}
		aq.display();

		aq.quickSort();

		aq.display();
	}
}
