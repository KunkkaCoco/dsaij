package com.maxi.c04;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StackApp {

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
		Stackx stackx = new Stackx(10);

		stackx.push(20);
		stackx.push(40);
		stackx.push(60);
		stackx.push(80);

		while (!stackx.isEmpty()) {

			long value = stackx.pop();
			System.out.print(value);
			System.out.print(" ");

		}
		System.out.println("");
	}

}