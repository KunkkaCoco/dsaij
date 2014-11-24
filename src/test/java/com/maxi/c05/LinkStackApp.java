package com.maxi.c05;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkStackApp {

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
		LinkStack theStack = new LinkStack();
		theStack.push(20);
		theStack.push(40);

		theStack.displayStack();

		theStack.push(60);
		theStack.push(80);

		theStack.displayStack();

		theStack.pop();
		theStack.pop();

		theStack.displayStack();
	}
}
