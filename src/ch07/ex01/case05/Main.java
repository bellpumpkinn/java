package ch07.ex01.case05;

public class Main {
	public static void main(String[] args) {
		Car car = new FireEngine(); //�ҹ����� ���� ���� ��Ȳ(���θ��)
		car.run();
		//car.water();  �� Ÿ������ �����Ҷ��� ���� ���Ѹ���. �ҹ��� Ÿ������ �����Ҷ� ���� �Ѹ����� �ִ�.
		
		FireEngine fireEngine = (FireEngine)car;
		fireEngine.water();
		fireEngine.run();
		
		((Car)fireEngine).run(); //carŸ������ ���� �ҹ����� �޸���.
		// ((Car)fireEngine).water();    carŸ������ �������Ƿ� ���� ���Ѹ���.
	}
}

/*
polymorphism(������)
-��ü�� 2���̻��� Ÿ���� �����ִ� ���� ���Ѵ�.
���������� �ٲ�°� ������ �������� �ٲ��.
*/