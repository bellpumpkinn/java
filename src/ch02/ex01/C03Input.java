package ch02.ex01;

import java.util.Scanner; //��Ʈ��+����Ʈ+O

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //�Է��� ������ �� �����.
		/*
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		// ����] <�Էµ�����>�� �Է��߽��ϴ�.�� Ȯ�θ޽����� ����϶�.
		String inputValue = sc.nextLine(); //�����Է��ϰ������ �����
		System.out.println(inputValue + "�� �Է��߽��ϴ�." );
		 */
		/*
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i = sc.nextInt(); 
		System.out.println(i + "�� �Է��߽��ϴ�.");
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i2 = sc.nextInt();
		System.out.println(i2 + "�� �Է��߽��ϴ�.");
		
		sc.nextLine();
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String inputValue = sc.nextLine();
		System.out.println(inputValue + "�� �Է��߽��ϴ�." );
		*/
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
		}
}
