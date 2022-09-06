package ch06.ex02.case01;

public class C extends A {
	public void test() {
		int x = 0;
		
		//x = this.a; // private이는 자식이라도 못건든다. 무조건 해당객체에서만 사용가능.
		x = this.b;
		x = this.c;
		x = this.d;
		
		
		// this.m1(); // 자식이라도 private은 본인만 사용가능.
		this.m2();
		this.m3();
		this.m4();
	}
}

//this.b도 a객체.b이다. 왜냐하면 A는 C의 부모클래스니까.
//private은 접근못하고 다른건 다 가능.