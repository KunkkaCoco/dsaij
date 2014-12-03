package com.maxi.c07;

public class ArraySh {

	private long[] arr;
	private int nElems;

	public ArraySh(int max) {
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

	public void shellSort() {

		int inner, outer;
		long temp;

		int h = 1;
		while (h < nElems / 3) {
			h = 3 * h + 1;
		}

		while (h > 0) {
			System.out.println("h ==========" + h);
			for (outer = h; outer < nElems; outer++) {
				temp = arr[outer];
				inner = outer;

				while (inner > h - 1 && arr[inner - h] >= temp) {
					arr[inner] = arr[inner - h];
					inner -= h;
				}
				arr[inner] = temp;
				// System.out.println(inner + " = " + temp);
			}
			h = (h - 1) / 3;
		}
	}
}
