package ch04.ex04;

import java.util.Scanner;

public class C03InOneNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		
		do {
			System.out.print("�Է�: ");
			input = scan.nextInt();
			
		} while(!(1 <= input && input <= 9)); //1~9���̰� �ƴ� ���� �Է��ϸ� �ݺ����� ����������.
		
		System.out.println("��.");
	}
}