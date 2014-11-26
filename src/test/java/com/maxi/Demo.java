package com.maxi;

import java.io.IOException;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.maxi.c01.BisectObj;

public class Demo {

	public static void main(String[] args) throws IOException {
		// System.out.println(getString());
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = i;
		}
		System.out.println(JSON.toJSONString(array));
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(JSON.toJSONString(a));

	}

	@Test
	public void test() {
		BisectObj d = new BisectObj();
		d.setElem(0, 00);
		d.setElem(1, 11);
		d.setElem(2, 22);
		d.setElem(3, 33);
		d.setElem(4, 44);
		d.setElem(5, 55);
		d.setElem(6, 56);
		d.setElem(7, 77);
		d.setElem(8, 88);
		d.setElem(9, 99);
		System.out.println("##############################");
		System.out.println(d.bisect(12));
	}

	public static long loop(long max) {
		long total = 0;
		long n = 1;
		while (n <= max) {
			total += n;
			n++;
		}
		return total;
	}

	public static long recursion(long n, long value) {
		if (n == 1) {
			return value;
		} else {
			return recursion(n - 1, value + n);
		}

	}

	public long getFactorial(long currNum, long sum) {
		if (currNum == 0) {
			return sum;
		}

		return getFactorial(currNum - 1, sum += currNum);
	}

	@Test
	public void testPerformance() {
		long start1 = System.currentTimeMillis();
		System.out.println("=========" + System.currentTimeMillis());
		System.out.println(loop(1000));
		System.out.println("=========" + (System.currentTimeMillis() - start1));
		long start2 = System.currentTimeMillis();
		System.out.println(getFactorial(1000, 0));
		System.out.println("=========" + (System.currentTimeMillis() - start2));
	}
}
