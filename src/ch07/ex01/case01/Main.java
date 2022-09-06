package ch07.ex01.case01;
//다형성
public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c;
		
		c = (C)a; //타입 - 객체의 모양 지금은 객체의 클래스를 이리저리 바꾸고 있는것.
		c = (C)b; //캐스팅
		
		b = (B)a;
		
		// String s = (String)c; //객체가 가지고있지않은타입으로는 캐스팅불가
	}
}


// A > B > C(작은타입,작은수) -> 프로모션

/*
캐스팅은 해당객체가 가지고있는 타입내에서만 가능하다.

*/