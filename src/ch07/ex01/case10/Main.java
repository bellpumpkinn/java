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
���� 3�� ����ī ����ī �׽���ī
���� �����ؼ� ���.
*/

/*
DAO(Data Access Object)
*/