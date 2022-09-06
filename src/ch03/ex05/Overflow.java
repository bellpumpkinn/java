package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c); // int*int = int로 되서 오버플로우때문에 값이 다르게 나옴.
		
		c = (long)a * b;	//해결책 : long으로 casting해준다.
		System.out.println(c); //10조
		
		int x = a * b / a;  //a*b에서 이미 오버플로우가 일어났기때문에 a로 나눠도 오버플로우가 된채로 나옴.
		System.out.println(x);
		
		x = a * (b / a);  //a*b가 오버플로우되니까 나누기를 먼저하고 곱한다.
		System.out.println(x);
	}
}
