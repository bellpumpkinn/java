package ch07.ex08.presentation;

import java.util.Scanner;

public interface Console { //�ٸ����������� ��밡��.
	Scanner sc = new Scanner(System.in);
	
	static int inNum(String msg) {
		System.out.print(msg + "\n>");
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
}

//���������� ���ӵ����ʴ´�. ���������� ��밡��.