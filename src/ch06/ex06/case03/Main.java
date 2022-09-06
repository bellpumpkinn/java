package ch06.ex06.case03;

public class Main {
	public static void main(String[] args) {
		//new Appliance(); 추상클래스와 인터페이스는 객체를 못만든다.
		Fridge fridge = new Fridge(); //일반클래스를 상속시켜 클래스를 만듬
		
		fridge.on();
		fridge.off();
	}
}

//implements를 씀.
//interface를 써야 확장성이 생김.

//자식클래스가 어떤 거를 생성해야할지 강제시킬수있다.
//표준을 정할려고, 강제를 할려고 , 인터페이스를 쓴다.