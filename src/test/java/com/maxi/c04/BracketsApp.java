package com.maxi.c04;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BracketsApp {

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
		String input, output;
		System.out.println("Enter a string: a{b[c(d]e}f");

		BracketChecker thebc1 = new BracketChecker("a{b[c(d]e}f");
		thebc1.check();

		System.out.println("Enter a string: a{b(c[d]e)f}g");
		BracketChecker thebc2 = new BracketChecker("a{b(c[d]e)f}g");
		thebc2.check();

	}
}