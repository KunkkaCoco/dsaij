package com.maxi.c04;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class InfixApp {
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
		// 3+(5-4)*(6+7)
		// String input = "354-67+*+";
		// 345+*612+/-
		String input = "3*(4+5)-6/(1+2)";

		In2Post i2p = new In2Post(input);
		String output = i2p.doTrans();
		System.out.println("Postfix id " + output);
	}
}
