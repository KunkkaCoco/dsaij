package com.maxi.c04;

public class Queue {
	private int maxiSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int s) {
		maxiSize = s;
		queArray = new long[maxiSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(long j){
		if ( rear == maxiSize - 1) {
			rear = -1;
		}
		queArray[rear++] = j;
		nItems++;
	}

	public long remove(){
		long temp = queArray[front++];
		if (front == maxiSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}

	public long peekFront(){
		return queArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxiSize);
	}

	public int size(){
		return nItems;
	}

}