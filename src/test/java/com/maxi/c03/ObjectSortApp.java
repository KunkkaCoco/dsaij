package com.maxi.c03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class ObjectSortApp {

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

		int maxSize = 100;
		ArrayInOb arr;
		arr = new ArrayInOb(maxSize);

		arr.insert("Evans", "Patty", 24);
		arr.insert("Smith", "Lorraine", 37);
		arr.insert("Yee", "Tom", 43);
		arr.insert("Adams", "Hery", 63);
		arr.insert("Hshimoto", "Sato", 21);
		arr.insert("Stimson", "Henry", 29);
		arr.insert("Velasquez", "Jose", 72);
		arr.insert("Lamarque", "Henry", 54);
		arr.insert("Vang", "Minh", 22);
		arr.insert("Creswell", "Lucinda", 18);


		arr.display();

		arr.insertionSort();
		arr.display();
	}

}
