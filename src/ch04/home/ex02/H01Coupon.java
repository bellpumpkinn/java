package ch04.home.ex02;

import java.util.Scanner;

public class H01Coupon {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		
		if(grade == 3) coupon = "10,000원";
		else if(grade == 2) coupon = "5,000원";
		else if(grade == 1) coupon = "1,000원";
		
		System.out.println(coupon);
		/*
		Scanner scan = new Scanner(System.in);
		String grade = "";
		String coupon = "";
		
		System.out.print("등급: ");
		grade = scan.nextLine();
		
		if(grade.equals("gold")) coupon = "10,000원";
		else if(grade.equals("silver")) coupon = "5,000원";
		if(grade.equals("copper")) coupon = "1,000원";
		
		System.out.println(coupon);
		*/
	}
}
/*
과제] ch04.ex02.C03Switch를 if로 refactoring 하라.
*/