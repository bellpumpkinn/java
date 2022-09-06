package ch05.ex05.case3;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	//    리턴타입  지역변수의 타입
	public Paper add(Paper paper) {
		paper.setResult(paper.getA() + paper.getB());
		return paper; //paper의 주소값이 리턴되서 paper=calcul의 앞의 paper로 넘어감
	}
}

//int, double만 데이터타입이 아니라 객체,클래스도 데이터타입이다.
//객체는 데이터타입이다. 클래스도 데이터타입이다.
//리턴타입, 지역변수의타입