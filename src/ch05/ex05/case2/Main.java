package ch05.ex05.case2;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		double result = calculator.add(1, 2); //int값 2개를 더했지만 리턴값은 double타입으로 프로모션된다.
		System.out.println(result);
		
		result = calculator.add(1.0, 2.0);
		System.out.println(result);
	}
}
