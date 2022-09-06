package ch05.ex05.case1;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2);
		
		System.out.println(result);
		
		result = calculator.add(1, 2, 3);
		System.out.println(result);
	}
}
//add(1, 2.0) int형인지, 숫자는 몇개 쓰는지 이런걸 다 맞춰줘야함