package ch06.ex01.case03;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run();
		
		leopard.eat();
		lion.shout();
		
		// lion.eat(); 사자에 없어서 사자는 eat이 불가능
	}
}
