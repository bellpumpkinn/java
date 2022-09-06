package ch07.ex01.case10;

public class Main {
	public static void main(String[] args) {
		AppleCar applecar = new AppleCar();
		GoogleCar googlecar = new GoogleCar();
		TeslaCar teslacar = new TeslaCar();
		
		teslacar.setOS(applecar);
		teslacar.setOS(googlecar);
		
		teslacar.start();
	}
}

/*
블럭이 3개 애플카 구글카 테슬라카
블럭을 조립해서 사용.
*/

/*
DAO(Data Access Object)
*/