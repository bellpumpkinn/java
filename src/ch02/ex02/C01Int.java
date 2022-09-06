package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		//integer(정수), decimal(정수)
		int x = 10; //decimal(10진수)
		System.out.println(Integer.toBinaryString(x));
		
		x = 012; // octal(8진수) 8진수는 숫자앞에 0을 붙인다.
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA; // hexa(16진수) 16진수는 숫자앞에 0x를 붙인다.
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010; // hexa(2진수) 2진수는 숫자앞에 0b를 붙인다.
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567; //천단위로 _(언더스코어)
		System.out.println(x + 1);
		
		double y = 1e1; //10의1승
		System.out.println(y);
	}
}
//boolean시작 - is로 시작