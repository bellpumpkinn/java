package ch05.ex05.case2;

public class Calculator {
	public double add(int a, int b) {
		return a + b; // 3.0으로 프로모션되서 출력됨
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	
}
