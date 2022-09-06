package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0; // ���� �ڸ�
		int oneDigit = 0; // ���� �ڸ�
		String grade = "";
		
		System.out.print("����: ");
		score = scan.nextInt();
		
		tenDigit = score / 10; 
		oneDigit = score % 10;
		
		if(tenDigit >= 9) grade = "A";
		else if(tenDigit >= 8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(oneDigit >= 8 || tenDigit == 10) grade += "+";
			else if(0 <= oneDigit && oneDigit < 4) grade += "-";
		}
		
		System.out.println(grade);
	}
}
/*
���� �������� ������ �ο��϶�.
98 �̻� A+
94 �̻� A
90 �̻� A-
88 �̻� B+
84 �̻� B
80 �̻� B-
80 �̸� C
--

����: 100
A+
	Scanner scan = new Scanner(System.in);
		
		int score = 0;
		String grade = "";
		
		System.out.print("����: ");
		score = scan.nextInt();
		
		if(score >= 98) grade = "A+";
		else if(score >= 94) grade = "A";
		else if(score >= 90) grade = "A-";
		else if(score >= 88) grade = "B+";
		else if(score >= 84) grade = "B";
		else if(score >= 80) grade = "B-";
		else grade = "C";
		
		System.out.println(grade);
*/