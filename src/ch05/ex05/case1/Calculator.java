package ch05.ex05.case1;
//오버로딩 - 하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개이상 선언한거를 말한다.
public class Calculator {
	public int add(int a, int b) { //transparent
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
//(int a, int b) add를 시작할때 형태. parameter라고함.
