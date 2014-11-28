package com.maxi.c06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class BinaryApp {

	public static void main(String[] args) {

	}

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
		int maxSize = 100;
		OrdArray arr;
		arr = new OrdArray(maxSize);

		arr.insert(72);
		arr.insert(90);
		arr.insert(45);
		arr.insert(126);
		arr.insert(54);
		arr.insert(99);
		arr.insert(144);
		arr.insert(27);
		arr.insert(135);
		arr.insert(81);
		arr.insert(18);
		arr.insert(108);
		arr.insert(9);
		arr.insert(117);
		arr.insert(63);
		arr.insert(36);

		arr.display();
		System.out.println("------------------------");
		System.out.println(JSON.toJSONString(arr.getArray()));

		long searchKey = 27;
		System.out.println(arr.find(searchKey));
		if (arr.find(searchKey) != -1) {
			System.out.println("Found " + searchKey);
		} else {
			System.out.println("Can't find " + searchKey);
		}
	}
}
