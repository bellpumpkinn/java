package ch06.ex02.case01;

public class B {
	public void test() { 
		A a= new A();
		
		int x = 0;
		//x = a.a; //private이라서 A객체 안에서만 사용가능해서 에러가 난다.
		x = a.b;
		x = a.c;
		x = a.d;
		
		//a.m1(); //private이라서 못쓴다.
		a.m2();
		a.m3();
		a.m4();
	}
	
}
