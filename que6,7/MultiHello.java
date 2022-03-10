package com.hello.app;



public class MultiHello {
	
	public void hello(int i) {
		System.out.println("int part");
	}
	
	public void hello(byte i) {
		System.out.println("byte part");
	}
	
	public void hello(short i) {
		System.out.println("short part");
	}
	
	public void hello(long i) {
		System.out.println("long part");
	}

	public static void main(String[] args) {
		MultiHello m = new MultiHello();
		m.hello(5);

	}

}
