package ch04.ex04;

import java.util.Scanner;

public class C02InLength {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		int len = 0;
		
		do {
			System.out.print("�ѱ��ڸ� �Է��ϼ���.: ");
			input = scan.nextLine();
			len = input.length();
			System.out.println(len + "���� �Է��߽��ϴ�.");
		} while(len != 1);
	}
}
