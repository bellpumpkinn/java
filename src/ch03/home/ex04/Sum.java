package ch03.home.ex04;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* �����Ѱ�
		System.out.print("a: ");
		int a = scan.nextInt();
		System.out.print("b: ");
		int b = scan.nextInt();
		
		int sum = a + b;
		
		System.out.printf("%d + %d = %d", a, b, sum);
		*/
		int a = 0; // ù��° �Է°�
		int b = 0; // �ι�° �Է°�
		
		System.out.print("a: ");
		a = scan.nextInt();
		System.out.print("b: ");
		b = scan.nextInt();
		
		System.out.printf("%d + %d = %d", a, b, a + b);
	}
}
/* [����]
�� �ڿ����� �Է� �޾�, �� �հ踦 ����϶�.
--

a: 1
b: 2
1 + 2 = 3
*/