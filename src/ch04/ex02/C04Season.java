package ch04.ex02;

import java.util.Scanner;

public class C04Season {
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��: ");
		month = scan.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			season = "��"; break;
		case 6: case 7: case 8:
			season = "����"; break;
		case 9: case 10: case 11:
			season = "����"; break;
		case 12, 1, 2:
			season = "�ܿ�";
		}
		
		System.out.printf("%d���� %s�Դϴ�.", month, season);
	}
}
