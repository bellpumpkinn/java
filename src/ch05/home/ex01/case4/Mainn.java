package ch05.home.ex01.case4;

import java.util.Scanner;
import java.time.LocalDate;

public class Mainn {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		int age = 0;
		LocalDate regDate = null;
		
		System.out.print("이름: ");
		name = scan.nextLine();
		System.out.print("나이: ");
		age = scan.nextInt();
		regDate = LocalDate.now();
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setRegDate(regDate);
		
		System.out.printf("\n이름: %s\n나이: %d\n가입일: %s", 
				user.getName(), user.getAge(), user.getRegDate());
	}
}
/*
과제] 사용자를 생성하라.
사용자의 이름, 나이를 수동 입력 받는다.
가입일은 오늘 날짜를 자동 입력 받는다.
--

이름: gambit
나이: 25

이름: gambit
나이: 25
가입일: 2022-06-21  
*/