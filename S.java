package com.kri;

class S {
	public static void main(String[] args) {
		E obj = new E();
		obj.village();
	}

}

abstract class K {
	abstract void village();

}

class Y extends K {
	void village() {
		System.out.println("write village name");
	}
}

class E extends K {
	void village() {
		System.out.println("write village place");
	}
}
