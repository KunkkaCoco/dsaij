package com.maxi.c04;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReverseApp {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before test##############################################################");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass test##########################################################");
	}

	public static void main(String[] args) throws IOException {
		String input, output;
		System.out.println("Enter a string: hello , world!");

		Reverser theReverser1 = new Reverser("hello , world!");
		output = theReverser1.doRev();
		System.out.println("Reversed :" + output);

		System.out.println("Enter a string: !dlrow , olleh");
		Reverser theReverser2 = new Reverser("!dlrow , olleh");
		output = theReverser2.doRev();
		System.out.println("Reversed :" + output);
	}

	@Test
	public void test() {
		String input, output;
		System.out.println("Enter a string: hello , world!");

		Reverser theReverser1 = new Reverser("hello , world!");
		output = theReverser1.doRev();
		System.out.println("Reversed :" + output);

		System.out.println("Enter a string: !dlrow , olleh");
		Reverser theReverser2 = new Reverser("!dlrow , olleh");
		output = theReverser2.doRev();
		System.out.println("Reversed :" + output);
	}

}