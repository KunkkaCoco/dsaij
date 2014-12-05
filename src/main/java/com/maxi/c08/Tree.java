package com.maxi.c08;

import java.util.Stack;

public class Tree {
	private Node root;

	public Tree() {
		root = null;
	}

	public Node find(int key) {
		Node current = root;
		while (current.iData != key) {
			if (key < current.iData) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			if (current == null) {
				return null;
			}
		}
		return current;
	}

	public void insert(int id, double dd) {
		Node nnode = new Node();
		nnode.iData = id;
		nnode.dData = dd;

		if (root == null) {
			root = nnode;
		} else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (id < current.iData) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = nnode;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = nnode;
						return;
					}
				}

			}
		}
	}

	public boolean delete(int key) {
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;

		// 查询插入点
		while (current.iData != key) {
			parent = current;
			if (key < current.iData) {
				isLeftChild = true;
				current = current.leftChild;
			} else {
				isLeftChild = false;
				current = current.rightChild;
			}
			if (current == null) {
				return false;
			}
		}

		// 1. 没有叶子节点
		if (current.leftChild == null && current.rightChild == null) {
			if (current == root) {
				root = null;
			} else if (isLeftChild) {
				parent.leftChild = null;

			} else {
				parent.rightChild = null;
			}
			// 2.只有左子叶
		} else if (current.rightChild == null) {
			if (current == root) {
				root = current.leftChild;
			} else if (isLeftChild) {
				parent.leftChild = current.leftChild;
			} else {
				parent.leftChild = current.leftChild;
			}
			// 3. 只有右子叶
		} else if (current.leftChild == null) {
			if (current == root) {
				root = current.rightChild;
			} else if (isLeftChild) {
				parent.leftChild = current.rightChild;
			} else {
				parent.rightChild = current.rightChild;
			}
			// 4. 叶子节点都有
		} else {
			// 查找继承者
			Node successor = getSuccessor(current);

		}

		return false;
	}

	public Node getSuccessor(Node delNode) {

		return null;
	}

	public void traverse(int traverseType) {

	}

	private void preOrder(Node localRoot) {

	}

	private void inOrder(Node localRoot) {

	}

	private void postOrder(Node localRoot) {

	}

	public void displayTree() {
		Stack globalStack = new Stack();

		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println(".................................");
	}
}
