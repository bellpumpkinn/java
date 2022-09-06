package ch05.ex07.case1;

public class Stack {
	public static void first() {
		int a = 0; //first안에 생긴 a변수는 스택에 쌓인다.
		Stack.second(); //second가 static메서드라서 클래스.변수명(또는 메서드명)으로 입력.
	}
	//서로 다른 메서드에는 같은이름의 변수를 써도 상관없다.
	public static void second() {
		int a = 0;
	}
}
//멤버메서드에서 다른멤버메서드를 호출할때 this를 붙인다.
//this는 객체
//