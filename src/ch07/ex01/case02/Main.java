package ch07.ex01.case02;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c;
		Object o = c;   //extends Object가 생략된거니까 항상존재
		
		c = (C)o;
		c = (C)a;
		c = (C)b;
		
		b = (B)o;
		b = (B)a;
	}
}


//꼭대기를 root라고 하는데 여기에는 extends Object이 존재