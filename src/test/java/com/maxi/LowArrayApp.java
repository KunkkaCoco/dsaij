package com.maxi;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.maxi.c1.LowArray;

public class LowArrayApp {

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
		LowArray arr = new LowArray(100);
		int nElems = 0;
		int j;

		arr.setElem(0, 77);
		arr.setElem(1, 99);
		arr.setElem(2, 44);
		arr.setElem(3, 55);
		arr.setElem(4, 22);
		arr.setElem(5, 88);
		arr.setElem(6, 11);
		arr.setElem(7, 00);
		arr.setElem(8, 56);
		arr.setElem(9, 33);

		nElems = 10;

		for (j = 0; j < nElems; j++) {
			System.out.print(arr.getElem(j) + " ");
		}
		System.out.println(" ");

		int searchKey = 26;
		for (j = 0; j < nElems; j++) {
			if (arr.getElem(j) == searchKey) {
				break;
			}
		}
		if (j == nElems) {
			System.out.println(" Can't find " + searchKey);
		} else {
			System.out.println(" Found " + searchKey);
		}

		for (j = 0; j < nElems; j++) {
			if (arr.getElem(j) == 55) {
				System.out.println(" remove 55");
				break;
			}
		}
		for (int k = j; k < nElems; k++) {
			arr.setElem(k, arr.getElem(k + 1));
		}
		nElems--;
		for (j = 0; j < nElems; j++) {
			System.out.print(arr.getElem(j) + " ");
		}
		System.out.println(" ");

	}
}
