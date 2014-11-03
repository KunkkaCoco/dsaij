package com.maxi;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayApp {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before test##############################################################");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass test##########################################################");
	}

	@Test
	public void test() {
		long[] arr = new long[100];

		int nElems = 0;
		int j;
		long searchKey;
		arr[0] = 77;
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 00;
		arr[7] = 66;
		arr[8] = 33;
		arr[9] = 10;

		nElems = 10;

		for (j = 0; j<nElems; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println("");

		searchKey = 27;
		for (j = 0; j<nElems; j++) {
			if (arr[j] == searchKey) {
				break;
			}
		}
		if (j==nElems) {
			System.out.println("Can't find " + searchKey);
		}else{
			System.out.println("Found " + searchKey);
		}

		searchKey = 55;
		for (j = 0; j<nElems; j++) {
			if (arr[j] == searchKey) {
				break;
			}
		}
		for (int k = j; k < nElems; k++) {
			arr[k] = arr[k+1];
		}
		nElems--;

		for (j = 0; j<nElems; j++) {
			System.out.print(arr[j] + " ");
		}

		System.out.println(" ");

	}
}
