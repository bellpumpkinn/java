package ch04.home.ex02;

import java.util.Scanner;

public class H02Season {
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��: ");
		month = sc.nextInt();
		
		if(3 <= month && month <= 5) season = "��";
		else if(6 <= month && month <= 8) season = "����";
		else if(9 <= month && month <= 11) season = "����";
		else if(month == 12 || month == 1 || month == 2) season = "�ܿ�";
		else season = "�������� �ʴ� ��";
		
		System.out.printf("%d���� %s�Դϴ�.", month, season);
	}
}
/*ch04.ex02.C04Season�� refactoring�Ѵ�.
switch�� if �� �ٲ۴�.
�������� ���� ���� �Է� �� ��츦, ����ó���Ѵ�.
*/
/*Scanner scan = new Scanner(System.in);

int month = 0;
String season = "";
String ex = "";

System.out.print("��: ");
month = scan.nextInt();

if(0 < month && month <= 12) {
	if(month >= 3 && month < 6) season = "��";
	else if (month >= 6 && month < 9) season = "����";
	else if (month >= 9 && month < 12) season = "����";
	else if ((0 < month && month < 3) || month == 12) season = "�ܿ�";
	System.out.printf("%d���� %s�Դϴ�", month, season);
}
else ex = "�߸��Է��ϼ̽��ϴ�.";
System.out.println(ex);*/