package ch05.ex05.case8;

public class Main {
	public static void main(String[] args) {
		Mom mom = new Mom();
		Child child = new Child();
		
		child.eat(mom.cook()); //엄마가 만든 파스타를 아이가 먹는다.
	}
}
