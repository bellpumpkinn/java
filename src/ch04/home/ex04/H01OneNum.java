package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		boolean isGood = false;
		String errMsg="ERROR] ���ڸ� �ڿ����� �Է��ϼ���.";
		
		do {
			System.out.print("�Է�: ");
			input = scan.nextLine();
			
			if(input.length() == 1 && '0' < input.charAt(0) && input.charAt(0) < '9')
				isGood = true;
			else System.out.println(errMsg);	
			
		} while(!isGood);
		
		System.out.println("��.");
	}
}
/*
����] ���ڸ� �ڿ����� �Է� �޴´�.
10�̻��� �ڿ���, �Ǵ� ���ڰ� �ԷµǸ� ����ó���Ѵ�.
*/