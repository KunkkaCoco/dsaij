package com.maxi.c07;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShellSortApp {

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

		ArraySh ash = new ArraySh(maxSize);

		for (int j = 0; j < maxSize; j++) {
			long n = (int) (Math.random() * 99);
			ash.insert(n);
		}
		ash.display();

		ash.shellSort();

		ash.display();
	}
}
