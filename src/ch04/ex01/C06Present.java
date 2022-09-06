package ch04.ex01;

import java.util.Scanner;

public class C06Present {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;		
		String prize = "";
		//복잡한데이터를 숫자로 표현
		System.out.print("1.냉장고, 2.세탁기\n>");
		choice = scan.nextInt();
		
		if(choice == 1) prize = "냉장고"; //디코딩작업
		else if(choice == 2) prize = "세탁기";
		else prize = "화장지"; //예외처리
		
		System.out.println(prize);
	}
}
//예외처리 2가지 - 에러메시지출력, 반복작업을 한다.