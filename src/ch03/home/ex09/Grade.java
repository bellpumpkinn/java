package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* ���� �� �ڵ�
		System.out.print("����: ");
		int sub1 = scan.nextInt(); 
		System.out.print("����: ");
		int sub2 = scan.nextInt();
		System.out.print("����: ");
		int sub3 = scan.nextInt();
		System.out.println();
		
		System.out.printf("����: %d", sub1 + sub2 + sub3);
		System.out.println();
		double mean = (sub1 + sub2 + sub3) / 3.0;
		System.out.printf("���: %.1f", mean);
		System.out.println();
		char grade = (mean >= 90 ) ? 'A' : (mean >= 80) ? 'B' : 'C';
		System.out.printf("����: %c", grade);
		*/
		int kor, eng, math, tot = 0;
		double avg = 0;
		char grade = 0;
		
		System.out.print("����: ");
		kor = scan.nextInt();
		System.out.print("����: ");
		eng = scan.nextInt();
		System.out.print("����: ");
		math = scan.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.0;
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : 'C'; //����Ͻ�����
		
		System.out.printf("\n����: %d \n���: %.1f \n����: %c", tot, avg, grade);	//�ͽ������Ƿ���
	}
}
/*[����]
����, ����, ���� ������ �Է¹޴´�.
����, ���, ������ ����Ѵ�.
��������� �Ҽ������� 1�ڸ������� ����Ѵ�.

90 <= mean <= 100 : A
80 <= mean < 90 : B
	  mean < 80 : C
--

����: 95
����: 100
����: 100

����: 295
���: 98.3
����: A 
*/