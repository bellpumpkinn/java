package ch07.ex08.presentation;

import java.util.Scanner;

public interface Console { //다른업무에서도 사용가능.
	Scanner sc = new Scanner(System.in);
	
	static int inNum(String msg) {
		System.out.print(msg + "\n>");
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
}

//점수업무에 종속되지않는다. 여러업무에 사용가능.