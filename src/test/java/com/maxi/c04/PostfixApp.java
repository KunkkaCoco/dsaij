package com.maxi.c04;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PostfixApp {
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
		// 3*(4+5)-6/(1+2)
		System.out.println("Postfix id : 3*(4+5)-6/(1+2)");
		int result;
		String input = "3*(4+5)-6/(1+2)";
		In2Post i2p = new In2Post(input);
		String out2input = i2p.doTrans();
		System.out.println("Enter postfix: " + out2input);
		ParsePost aParser = new ParsePost(out2input);
		result = aParser.doParse();
		System.out.println("Evaluates to " + result);
	}
}
