package ch04.home.ex02;

import java.util.Scanner;

public class H02Season {
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월: ");
		month = sc.nextInt();
		
		if(3 <= month && month <= 5) season = "봄";
		else if(6 <= month && month <= 8) season = "여름";
		else if(9 <= month && month <= 11) season = "가을";
		else if(month == 12 || month == 1 || month == 2) season = "겨울";
		else season = "존재하지 않는 월";
		
		System.out.printf("%d월은 %s입니다.", month, season);
	}
}
/*ch04.ex02.C04Season을 refactoring한다.
switch를 if 로 바꾼다.
존재하지 않은 월을 입력 할 경우를, 예외처리한다.
*/
/*Scanner scan = new Scanner(System.in);

int month = 0;
String season = "";
String ex = "";

System.out.print("월: ");
month = scan.nextInt();

if(0 < month && month <= 12) {
	if(month >= 3 && month < 6) season = "봄";
	else if (month >= 6 && month < 9) season = "여름";
	else if (month >= 9 && month < 12) season = "가을";
	else if ((0 < month && month < 3) || month == 12) season = "겨울";
	System.out.printf("%d월은 %s입니다", month, season);
}
else ex = "잘못입력하셨습니다.";
System.out.println(ex);*/