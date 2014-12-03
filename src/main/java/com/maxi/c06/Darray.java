package com.maxi.c06;

import java.io.Serializable;

public class Darray implements Serializable {

	private static final long serialVersionUID = 1L;

	private long[] arr;
	private int nElems;

	public Darray(int max) {
		arr = new long[max];
		nElems = 0;
	}

	public long[] getArr() {
		return arr;
	}

	public void setArr(long[] arr) {
		this.arr = arr;
	}

	public int getnElems() {
		return nElems;
	}

	public void setnElems(int nElems) {
		this.nElems = nElems;
	}

	public void insert(long value) {
		arr[nElems] = value;
		nElems++;
	}

	public void display() {
		for (long element : arr) {
			System.out.print(element + " ");
		}

		System.out.println("");
	}

	public void mergeSort() {
		long[] workSpace = new long[nElems];
		recMergeSort(workSpace, 0, nElems - 1);
	}

	private void recMergeSort(long[] workspace, int lowerBound, int upperBound) {
		if (lowerBound == upperBound) {
			return;
		} else {
			int mid = (lowerBound + upperBound) / 2;

			recMergeSort(workspace, lowerBound, mid);

			recMergeSort(workspace, mid + 1, upperBound);

			merge(workspace, lowerBound, mid + 1, upperBound);

		}
	}

	private void merge(long[] workspace, int lowPtr, int highPtr, int upperBound) {
		int j = 0;
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1;

		while (lowPtr <= mid && highPtr <= upperBound) {
			if (arr[lowPtr] < arr[highPtr]) {
				workspace[j++] = arr[lowPtr++];
			} else {
				workspace[j++] = arr[highPtr++];
			}
		}
		while (lowPtr <= mid) {
			workspace[j++] = arr[lowPtr++];
		}
		while (highPtr <= upperBound) {
			workspace[j++] = arr[highPtr++];
		}
		for (j = 0; j < n; j++) {
			arr[lowerBound + j] = workspace[j];
		}
	}
}
