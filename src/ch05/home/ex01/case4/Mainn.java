package ch05.home.ex01.case4;

import java.util.Scanner;
import java.time.LocalDate;

public class Mainn {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		int age = 0;
		LocalDate regDate = null;
		
		System.out.print("�̸�: ");
		name = scan.nextLine();
		System.out.print("����: ");
		age = scan.nextInt();
		regDate = LocalDate.now();
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setRegDate(regDate);
		
		System.out.printf("\n�̸�: %s\n����: %d\n������: %s", 
				user.getName(), user.getAge(), user.getRegDate());
	}
}
/*
����] ����ڸ� �����϶�.
������� �̸�, ���̸� ���� �Է� �޴´�.
�������� ���� ��¥�� �ڵ� �Է� �޴´�.
--

�̸�: gambit
����: 25

�̸�: gambit
����: 25
������: 2022-06-21  
*/