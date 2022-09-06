package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* 내가 한 코드
		System.out.print("국어: ");
		int sub1 = scan.nextInt(); 
		System.out.print("영어: ");
		int sub2 = scan.nextInt();
		System.out.print("수학: ");
		int sub3 = scan.nextInt();
		System.out.println();
		
		System.out.printf("총점: %d", sub1 + sub2 + sub3);
		System.out.println();
		double mean = (sub1 + sub2 + sub3) / 3.0;
		System.out.printf("평균: %.1f", mean);
		System.out.println();
		char grade = (mean >= 90 ) ? 'A' : (mean >= 80) ? 'B' : 'C';
		System.out.printf("학점: %c", grade);
		*/
		int kor, eng, math, tot = 0;
		double avg = 0;
		char grade = 0;
		
		System.out.print("국어: ");
		kor = scan.nextInt();
		System.out.print("영어: ");
		eng = scan.nextInt();
		System.out.print("수학: ");
		math = scan.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.0;
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : 'C'; //비즈니스로직
		
		System.out.printf("\n총점: %d \n평균: %.1f \n학점: %c", tot, avg, grade);	//익스프레션로직
	}
}
/*[과제]
국어, 영어, 수학 점수를 입력받는다.
총점, 평균, 학점을 출력한다.
평균점수는 소수점이하 1자리까지만 출력한다.

90 <= mean <= 100 : A
80 <= mean < 90 : B
	  mean < 80 : C
--

국어: 95
영어: 100
수학: 100

총점: 295
평균: 98.3
학점: A 
*/