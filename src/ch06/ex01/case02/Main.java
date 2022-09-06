package ch06.ex01.case02;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run(); //lion클래스안에 run이 없어도 상속됐기때문에 run을 쓸수가 있다.
	}
}
