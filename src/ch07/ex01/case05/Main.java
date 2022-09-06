package ch07.ex01.case05;

public class Main {
	public static void main(String[] args) {
		Car car = new FireEngine(); //소방차를 차로 보는 상황(프로모션)
		car.run();
		//car.water();  차 타입으로 존재할때는 물을 못뿌린다. 소방차 타입으로 존재할때 물을 뿌릴수가 있다.
		
		FireEngine fireEngine = (FireEngine)car;
		fireEngine.water();
		fireEngine.run();
		
		((Car)fireEngine).run(); //car타입으로 변한 소방차가 달린다.
		// ((Car)fireEngine).water();    car타입으로 변했으므로 물은 못뿌린다.
	}
}

/*
polymorphism(다형성)
-객체가 2개이상의 타입을 갖고있는 것을 말한다.
물리적으로 바뀌는건 없지만 논리적으로 바뀐다.
*/