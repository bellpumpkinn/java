package ch02.home.ex01;

public class H01Replacement {
	public static void main(String[] args) {		
		/* 내가 친 코드
		int a = 1;
		int b = 2;
		int c = 0;

		c = a;
		a = b;
		b = c;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		*/
		int a = 1;
		int b = 2;
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;  //physical하게는 교체가 되진않았지만 logical하게는 교체됐다 생각.
	}
}

/*
 * 과제] 두 변수의 데이터를 교체하라.
 *  a:1, b:2 --> a:2, b:1
 */