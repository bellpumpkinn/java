package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0; //소수점이하 한자리로 만드는것
		System.out.println(shortPi); // 3.1이 출력.
		
		shortPi = (int)(pi * 1000) / 1000.0; //0의 개수가 소수점 자리수다.
		System.out.println(shortPi); //과제]출력결과물이 3.141이 되도록하라.
		
		shortPi = Math.round(pi * 1000) / 1000.0; //소수점이하 한자리로 만드는것
		System.out.println(shortPi); //과제]3.142가 되도록하라.
	}
}
