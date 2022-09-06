package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3; //fnal 붙이면 변수max에 새로운값을 못넣는다. final 쓸때 대문자로 쓰면 더 좋음
		//max = 1; final때문에 max값 변경 불가.
		
		double area = 3.14 * 3 * 3;
		
		final double PI = 3.14; //PI값을 절대 못바꿈
		int r = 3;
		area = PI * r * r; //위에 보다 분석하기가 수월하다.
		
	}
}
