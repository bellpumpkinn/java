package ch07.ex01.case03;

public class Main {
	public static void main(String[] args) {
		D d = new D();
		C c = d;
		B b = d;
		A a = d; //A타입으로 프로모션
		Object o = d;
		
		d = (D)o;
		d = (D)a;
		d = (D)b;
		d = (D)c;
		
		c = (C)o;
		c = (C)a;
		c = (C)b;
		
		
	}
}
