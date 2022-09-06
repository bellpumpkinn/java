package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
		
		//x = this.a;
		//x = this.b; //디폴트 프로텍티드의 공통점은 다른패키지에 있으면 안보임.
		x = this.c; // 하지만 다른패키지라도 자식이면 보여주는거는 protected
		x = this.d;
		x = this.d;
		
		//this.m1();
		//this.m2();
		this.m3(); //자식이라서 보인다.(protected 접근제한자)
		this.m4();
	}
		
		
}
