package com.maxi.c04;

public class PriorityQ {

	private int maxiSize;
	private long[] queArray;
	private int nItems;

	public PriorityQ(int s) {
		maxiSize = s;
		queArray = new long[maxiSize];
		nItems = 0;
	}

	public void insert(long item) {
		int j;
		if (nItems == 0) {
			queArray[nItems++] = item;
		} else {
			for (j = nItems; j >= 0; j--) {
				if (item > queArray[j]) {
					queArray[j + 1] = queArray[j];
				} else {
					break;
				}
			}
			queArray[j + 1] = item;
			nItems++;
		}
	}

	public long remove() {
		return queArray[--nItems];
	}

	public long pop() {
		return queArray[--nItems];
	}

	public long peekMin() {
		return queArray[nItems - 1];
	}

	public boolean isEmpty() {
		return nItems == 0;
	}

	public boolean isFull() {
		return nItems == maxiSize;
	}

}
