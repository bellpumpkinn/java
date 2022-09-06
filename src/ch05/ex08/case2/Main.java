package ch05.ex08.case2;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("최한석", 25, LocalDate.now()); //맞춰서 써야지 오류가 안남
		
		User user2 = new User();
		user2.setName("양승일");
		user2.setAge(35);
		user2.setRegDate(LocalDate.now());
		
		System.out.printf("%s %d %s\n", user1.getName(), user1.getAge(), user1.getRegDate());
		System.out.printf("%s %d %s", user2.getName(), user2.getAge(), user2.getRegDate());
	}
}
//도메인에는 기본생성자가 있도록하자
//기본생성자 만드는방법 2가지.
//1. 클래스에다가 어떠한 생성자도 입력하지않는다.
//2. 내가 직접 기본생성자를 입력한다.