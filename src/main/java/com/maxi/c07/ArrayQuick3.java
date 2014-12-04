package com.maxi.c07;

public class ArrayQuick3 extends MyArray {

	public ArrayQuick3(int max) {
		super(max);
	}

	public void quickSort() {
		recQuickSort(0, nElems - 1);
	}

	public void recQuickSort(int left, int right) {
		int size = right - left;
		if (size < 10) {
			insertSort(left, right);
		} else {
			long median = medianof3(left, right);
			int partition = partitionIt(left, right, median);
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	}

	public long medianof3(int left, int right) {
		int center = (left + right) / 2;
		if (theArray[left] > theArray[center]) {
			swap(left, center);
		}
		if (theArray[left] > theArray[right]) {
			swap(left, right);
		}

		if (theArray[center] > theArray[right]) {
			swap(center, right);
		}
		swap(center, right - 1);
		return theArray[right - 1];
	}

	public void insertSort(int left, int right) {
		int in, out;
		for (out = left + 1; out < right + 1; out++) {
			long temp = theArray[out];
			in = out;
			while (in > left && theArray[in - 1] >= temp) {
				theArray[in] = theArray[in - 1];
				in--;
			}
			theArray[in] = temp;
		}
	}

	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;
		while (true) {
			while (theArray[++leftPtr] < pivot) {
			}
			while (theArray[--rightPtr] > pivot) {
			}
			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr, rightPtr);
			}
		}
		swap(leftPtr, right);
		return leftPtr;
	}
}
