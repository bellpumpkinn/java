package ch04.ex04;

import java.util.Scanner;

public class C01DoWhile { //C01DoWhile ��
	public static void main(String[] args) { //main��
		Scanner scan = new Scanner(System.in);
		int a = 0; 
		int b = 0;
		int result = 0;
		
		do {
			System.out.print("a: ");
			a = scan.nextInt();
			
			System.out.print("b: ");
			b = scan.nextInt();
			
			System.out.printf("%d + %d = %d\n\n", a, b, result = a + b);
		} while (result != 0);
		//���ǹ����� true�� ���� ��� ����
		//while�� 0ȸ�̻� �ݺ�, do while�� 1ȸ�̻� �ݺ��Ѵ�.
		//while�� 0ȸ�� �Ǵ°�� �ٳѱ⿡�� �����԰� 60������ ���
	}
}
