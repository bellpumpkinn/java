package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a값 = ");
		int a = scan.nextInt();
		System.out.print("b값 = ");
		int b = scan.nextInt();
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a값 = " + a);
		System.out.println("b값 = " + b);
		*/	
		Scanner scan = new Scanner(System.in);
		//presentaion logic
		System.out.print("a: ");
		int a = scan.nextInt();
		System.out.print("b: ");
		int b = scan.nextInt();
		System.out.printf("=> a: %d, b: %d\n", a, b);
		
		System.out.println("=> a, b값을 교체합니다.");
		int temp = 0; // business logic
		temp = a; //temp에 a값을 백업(backup)
		a = b;
		b = temp;
		System.out.printf("=> a: %d, b: %d\n", a, b);
	}
}
/*
과제] a, b 변수의 값을 교체하라.

a와 b값을 임의로 입력 받는다.
교체 결과를 출력한다.
*/