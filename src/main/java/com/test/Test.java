package com.test;
class Haha {
	int i = 3;
	int k = 2;
}

class Parent extends Haha {
	int i = 0;

	public void f() {
		System.out.println("Parent");
	}

}

class Child extends Parent {
	int i = 1;
	int j = 1;

	@Override
	public void f() {
		System.out.println("Child1");
	}

	public void g() {
		System.out.println("Child2");
	}
}

public class Test {
	public static void main(String[] args) {
		Haha haha2 = new Child();
		Parent haha = new Child();
		Child haha1 = new Child();
		haha.f();
		haha1.f();

		System.out.println(haha.i); // 0
		System.out.println(haha.k); // 2
		System.out.println(haha1.i); // 2
		System.out.println(haha2.i); // 2
	}
}
