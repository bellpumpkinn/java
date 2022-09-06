package ch05.ex05.case4;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog(); //개1마리 생성
		
		dog.setName("왈왈");
		dog.setBreed("진도개");
		
		dog.shout();
		dog.eat();
	}
}
