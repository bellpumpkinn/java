package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.52;
		int i = (int)d;	
		System.out.printf("%d, %f\n", i, d);
		
		double f = Math.floor(d); //floor는 내림처리해서 1.0 의미
		double r = Math.round(d); //round는 반올림처리를 해서 2.0을 나타냄
		
		System.out.printf("%f, %f", f, r);
		}
}	
