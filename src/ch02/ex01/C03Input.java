package ch02.ex01;

import java.util.Scanner; //컨트롤+쉬프트+O

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력은 무조건 얘 써놔라.
		/*
		System.out.print("문자열을 입력하세요.\n>");
		// 과제] <입력데이터>를 입력했습니다.는 확인메시지를 출력하라.
		String inputValue = sc.nextLine(); //문자입력하고싶을때 쓰면됨
		System.out.println(inputValue + "를 입력했습니다." );
		 */
		/*
		System.out.print("숫자를 입력하세요.\n>");
		int i = sc.nextInt(); 
		System.out.println(i + "를 입력했습니다.");
		
		System.out.print("숫자를 입력하세요.\n>");
		int i2 = sc.nextInt();
		System.out.println(i2 + "를 입력했습니다.");
		
		sc.nextLine();
		System.out.print("문자열을 입력하세요.\n>");
		String inputValue = sc.nextLine();
		System.out.println(inputValue + "를 입력했습니다." );
		*/
		System.out.print("문자를 입력하세요.\n>");
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
		}
}
