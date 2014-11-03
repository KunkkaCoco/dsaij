package com.maxi.c1;

public class BisectObj {
	// 有序数组
	private long[] arr = new long[10];
	private int nElems = 10;

	// 有序数组才能进行二分查找
	public int bisect(long searchKey) {

		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;
		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (getElem(curIn) == searchKey) {
				return curIn;
			} else if (lowerBound > upperBound) {
				return -1;
			} else {
				if (getElem(curIn) < searchKey) {
					lowerBound = curIn + 1;
				} else {
					upperBound = curIn - 1;
				}

			}

		}
	}

	public void setElem(int index, long value) {
		arr[index] = value;
	}

	public long getElem(int index) {
		return arr[index];
	}
}
