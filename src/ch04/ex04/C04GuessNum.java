package ch04.ex04;

import java.util.Scanner;

public class C04GuessNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int target = 0; //app�� ������ ���� Ÿ�ٿ� ����
		int guess = 0; // ���� �����Ѱ��� �Խ��� ����
		int tries = 0; // ������� �ߴ��� Ƚ�� ����
		String msg = "";
		
		target = (int)(Math.random() * 1000) + 1;
		
		do {
			System.out.print("����.: ");
			guess = scan.nextInt();
			tries++;
			
			if(guess > target) msg = "Down.";
			else if (guess < target) msg = "Up.";
			else msg = "Great";
			System.out.println(msg);
		} while(guess != target);
		
		System.out.printf("%d������ %d�� ������ϴ�.", tries, target);
	}
}
