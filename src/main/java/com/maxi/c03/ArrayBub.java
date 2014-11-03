package com.maxi.c03;

public class ArrayBub {

	private long[] a;
	private int nElems;

	public ArrayBub(int max) {
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

	public void bubbleSort() {
		int out, in;
		for (out = nElems - 1; out > 1; out--) {
			for (in = 0; in < out; in++) {
				if (a[in] > a[in + 1]) {
					swap(in, in + 1);
				}
			}
		}
	}

	public void bubbleSort2() {
		int out, out1 = 0;
		for (out = nElems - 1; out > out1; out = out - 1, out1 = out1 + 1) {

			for (int in = out1; in < out; in++) {
				if (a[in] > a[in + 1]) {
					swap(in, in + 1);
				}
			}
			for (int in = out - 1; in > out1; in--) {
				if (a[in] < a[in - 1]) {
					swap(in, in - 1);
				}
			}
		}
	}

	public void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
