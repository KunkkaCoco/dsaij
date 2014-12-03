package com.maxi.c07;

public class MyArray {

	protected long[] theArray;
	protected int nElems;

	public MyArray(int max) {
		theArray = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}

	public int size() {
		return nElems;
	}

	public boolean isEmpty() {
		return nElems == 0;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}

		System.out.println("");
	}

	public void swap(int left, int right) {
		long temp = theArray[right];
		theArray[right] = theArray[left];
		theArray[left] = temp;
	}
}
