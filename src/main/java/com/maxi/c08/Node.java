package com.maxi.c08;

import com.alibaba.fastjson.JSON;

public class Node {

	public int iData;
	public double dData;
	public Node leftChild;
	public Node rightChild;

	public int getiData() {
		return iData;
	}

	public void setiData(int iData) {
		this.iData = iData;
	}

	public double getdData() {
		return dData;
	}

	public void setdData(double dData) {
		this.dData = dData;
	}

	public void displayNode() {
		System.out.println(JSON.toJSONString(this));
	}
}
