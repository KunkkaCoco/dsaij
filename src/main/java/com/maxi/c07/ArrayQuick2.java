package com.maxi.c07;

public class ArrayQuick2 extends MyArray {

	public ArrayQuick2(int max) {
		super(max);
	}

	public void quickSort() {
		recQuickSort(0, nElems - 1);
	}

	public void recQuickSort(int left, int right) {
		int size = right - left;
		if (size <= 3) {
			manualSort(left, right);
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

	public void manualSort(int left, int right) {
		int size = right - left + 1;
		if (size <= 1) {
			return;
		}
		if (size == 2) {
			if (theArray[left] > theArray[right]) {
				swap(left, right);
			}
			return;
		} else {
			if (theArray[left] > theArray[right - 1]) {
				swap(left, right - 1);
			}
			if (theArray[left] > theArray[right]) {
				swap(left, right);
			}
			if (theArray[right - 1] > theArray[right]) {
				swap(right - 1, right);
			}
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
