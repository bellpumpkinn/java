package ch05.home.ex02.case2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Paper paper = new Paper();
		
		System.out.print("메세지: "); //out은 멤버변수.
		paper.setMsg(scan.nextLine());
		System.out.print("작성자명: ");
		paper.setWriterName(scan.nextLine());
		//setter는 입력을 하는거.
		
		System.out.printf("\n%s from %s", paper.getMsg(), paper.getWriterName());
		//getter는 setter로 입력된 값을 가져오는거
	}
}
/*
과제] 종이에 메세지와 작성자명을 기록하라.
--

메세지: hello
작성자명: terry

hello from terry.
*/
//요구사항보면 먼저 명사를 뽑아라. 종이 메세지 작성자명.
//작성자는 객체, 작성자명은 속성.