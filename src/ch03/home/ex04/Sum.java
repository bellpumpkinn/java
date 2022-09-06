package ch03.home.ex04;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* 내가한거
		System.out.print("a: ");
		int a = scan.nextInt();
		System.out.print("b: ");
		int b = scan.nextInt();
		
		int sum = a + b;
		
		System.out.printf("%d + %d = %d", a, b, sum);
		*/
		int a = 0; // 첫번째 입력값
		int b = 0; // 두번째 입력값
		
		System.out.print("a: ");
		a = scan.nextInt();
		System.out.print("b: ");
		b = scan.nextInt();
		
		System.out.printf("%d + %d = %d", a, b, a + b);
	}
}
/* [과제]
두 자연수를 입력 받아, 그 합계를 출력하라.
--

a: 1
b: 2
1 + 2 = 3
*/