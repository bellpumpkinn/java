package ch05.home.ex02.case2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Paper paper = new Paper();
		
		System.out.print("�޼���: "); //out�� �������.
		paper.setMsg(scan.nextLine());
		System.out.print("�ۼ��ڸ�: ");
		paper.setWriterName(scan.nextLine());
		//setter�� �Է��� �ϴ°�.
		
		System.out.printf("\n%s from %s", paper.getMsg(), paper.getWriterName());
		//getter�� setter�� �Էµ� ���� �������°�
	}
}
/*
����] ���̿� �޼����� �ۼ��ڸ��� ����϶�.
--

�޼���: hello
�ۼ��ڸ�: terry

hello from terry.
*/
//�䱸���׺��� ���� ��縦 �̾ƶ�. ���� �޼��� �ۼ��ڸ�.
//�ۼ��ڴ� ��ü, �ۼ��ڸ��� �Ӽ�.