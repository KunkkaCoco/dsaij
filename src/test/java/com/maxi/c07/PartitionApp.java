package com.maxi.c07;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PartitionApp {
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

		ArrayPar apr = new ArrayPar(maxSize);

		for (int j = 0; j < maxSize; j++) {
			long n = (int) (Math.random() * 199);
			apr.insert(n);
		}
		apr.display();

		long pivot = 99;

		int partion = apr.partitionIt(0, 15, pivot);

		System.out.println(partion);
		apr.display();
	}
}
