package com.maxi.c05;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class InterIterApp {

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
		LinkList1 thelist = new LinkList1();
		ListInterator iter1 = thelist.getIterator();
		long value;
		iter1.insertAfter(20);
		iter1.insertAfter(40);
		iter1.insertAfter(80);
		iter1.insertBefore(60);

		iter1.reset();
		while (true) {
			System.out.println(JSON.toJSONString(iter1));
			iter1.nextLink();
			if (iter1.atEnd()) {
				System.out.println(JSON.toJSONString(iter1));
				break;
			}
		}
	}
}
