package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����: ");
		char ch = scan.nextLine().charAt(0);
		
		int unicode = ch;
		System.out.printf("%c�� unicode�� %d�Դϴ�.", ch, unicode);
	}
}


/*
����] �Է��� ������ unicode �� ����϶�.
--

����: A
A�� unicode�� 65�Դϴ�.
*/