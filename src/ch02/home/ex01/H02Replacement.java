package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a�� = ");
		int a = scan.nextInt();
		System.out.print("b�� = ");
		int b = scan.nextInt();
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a�� = " + a);
		System.out.println("b�� = " + b);
		*/	
		Scanner scan = new Scanner(System.in);
		//presentaion logic
		System.out.print("a: ");
		int a = scan.nextInt();
		System.out.print("b: ");
		int b = scan.nextInt();
		System.out.printf("=> a: %d, b: %d\n", a, b);
		
		System.out.println("=> a, b���� ��ü�մϴ�.");
		int temp = 0; // business logic
		temp = a; //temp�� a���� ���(backup)
		a = b;
		b = temp;
		System.out.printf("=> a: %d, b: %d\n", a, b);
	}
}
/*
����] a, b ������ ���� ��ü�϶�.

a�� b���� ���Ƿ� �Է� �޴´�.
��ü ����� ����Ѵ�.
*/