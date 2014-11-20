package com.test;

public class Forwhile {
	public static void main(String[] args) {
		int i, j;
		for (i = 0; i < 10; i++) {
			if (i < 5) {
				System.out.println("i in for index : " + i);
			} else {
				break;
			}
		}
		System.out.println("out for index :" + i);
		System.out.println("++++++++++++++++++++");

		for (j = 10; j >= 0; j--) {
			if (j > 5) {
				System.out.println("j in for index : " + j);
			} else {
				break;
			}
		}
		System.out.println("out for index :" + j);
	}
}
