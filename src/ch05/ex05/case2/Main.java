package ch05.ex05.case2;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		double result = calculator.add(1, 2); //int�� 2���� �������� ���ϰ��� doubleŸ������ ���θ�ǵȴ�.
		System.out.println(result);
		
		result = calculator.add(1.0, 2.0);
		System.out.println(result);
	}
}
