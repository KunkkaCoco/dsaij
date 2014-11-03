package com.maxi.c03;

public class ArrayIns {

	private long[] a;
	private int nElems;

	public ArrayIns(int max) {
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public void display() {
		for (int j = 0; j < nElems; j++) {
			System.out.println(a[j] + " ");
		}
		System.out.println(" ");
	}

	public void insertSort() {
		int out, in;
		for (out = 1; out < nElems; out++) {
			long temp = a[out];
			in = out;
			while (in > 0 && a[in - 1] >= temp) {
				a[in] = a[in - 1];
				--in;
			}
			a[in] = temp;
		}
	}

	public void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}

	public long median() {

		return 0;
	}
}
