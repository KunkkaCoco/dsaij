package com.maxi.c04;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.maxi.c04.Queue;
public class QueueApp {

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
	
		Queue theQueue = new Queue(5);
		theQueue.insert(10);
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);

		theQueue.remove();
		theQueue.remove();
		theQueue.remove();

		theQueue.insert(50);
		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);

		while(!theQueue.isEmpty()){
			long n = theQueue.remove();
			System.out.println(n);
		}

	}

}