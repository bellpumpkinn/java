package ch06.ex02.case01.sub;

import ch06.ex02.case01.A; //경로문제를 해결가능.

public class B {
	public void test() { //test는 B객체가 존재하는걸 전제로 한다.
		//ch06.ex02.case01.A a = new ch06.ex02.case01.A(); // 근데 잘 안씀
		A a = new A(); //import로 해결가능. 아니면 클래스의 풀네임을 다 쓸수도 있다.
		
		int x = 0;
		//x = a.a; //private은 해당 객체내에서만 사용가능하기때문에 에러.
		//x = a.b; //defalut : 같은패키지는 접근이 되는데 다른패키지는 접근이 안된다.
		//x = a.c; //protected: 마찬가지로 다른패키지에 있으면 접근이 안된다.
		x = a.d; //public 은 다 된다.
		
		//a.m1();
		//a.m2();
		//a.m3();
		a.m4();    //public만 다른패키지도 다 접근 가능.
	}
}
