package ch04.home.ex02;

import java.util.Scanner;

public class H01Coupon {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		
		if(grade == 3) coupon = "10,000��";
		else if(grade == 2) coupon = "5,000��";
		else if(grade == 1) coupon = "1,000��";
		
		System.out.println(coupon);
		/*
		Scanner scan = new Scanner(System.in);
		String grade = "";
		String coupon = "";
		
		System.out.print("���: ");
		grade = scan.nextLine();
		
		if(grade.equals("gold")) coupon = "10,000��";
		else if(grade.equals("silver")) coupon = "5,000��";
		if(grade.equals("copper")) coupon = "1,000��";
		
		System.out.println(coupon);
		*/
	}
}
/*
����] ch04.ex02.C03Switch�� if�� refactoring �϶�.
*/