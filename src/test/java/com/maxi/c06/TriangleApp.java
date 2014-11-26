package com.maxi.c06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleApp {
	static int theNumber;

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
		triangle(10);
	}

	public static int triangle(int n) {
		System.out.println("Entering : n = " + n);
		if (n == 1) {
			System.out.println("Returning 1");
			return 1;
		} else {
			int temp = n + triangle(n - 1);
			System.out.println("Returning " + temp);
			return temp;
		}

	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a number : ");
		theNumber = getInt();
		int theAnswer = triangle(theNumber);
		System.out.println("Triangle = " + theAnswer);
	}
}
