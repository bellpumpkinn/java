package ch04.ex01;

import java.util.Scanner;

public class C06Present {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;		
		String prize = "";
		//�����ѵ����͸� ���ڷ� ǥ��
		System.out.print("1.�����, 2.��Ź��\n>");
		choice = scan.nextInt();
		
		if(choice == 1) prize = "�����"; //���ڵ��۾�
		else if(choice == 2) prize = "��Ź��";
		else prize = "ȭ����"; //����ó��
		
		System.out.println(prize);
	}
}
//����ó�� 2���� - �����޽������, �ݺ��۾��� �Ѵ�.