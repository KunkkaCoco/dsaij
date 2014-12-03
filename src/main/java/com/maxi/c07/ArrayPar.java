package com.maxi.c07;

public class ArrayPar {

	private long[] theArray;
	private int nElems;

	public ArrayPar(int max) {
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

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}

		System.out.println("");
	}

	public int partitionIt(int left, int right, long pivot) {

		int leftptr = left - 1;
		int rightptr = right + 1;

		while (true) {

			while (leftptr < right && theArray[++leftptr] < pivot) {

			}
			while (rightptr > left && theArray[--rightptr] > pivot) {

			}

			if (leftptr >= rightptr) {
				break;
			} else {
				swap(leftptr, rightptr);
			}
		}
		return leftptr;
	}

	public void swap(int left, int right) {
		long temp = theArray[right];
		theArray[right] = theArray[left];
		theArray[left] = temp;
	}
}
