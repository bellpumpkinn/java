package ch02.home.ex01;

public class H01Replacement {
	public static void main(String[] args) {		
		/* ���� ģ �ڵ�
		int a = 1;
		int b = 2;
		int c = 0;

		c = a;
		a = b;
		b = c;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		*/
		int a = 1;
		int b = 2;
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;  //physical�ϰԴ� ��ü�� �����ʾ����� logical�ϰԴ� ��ü�ƴ� ����.
	}
}

/*
 * ����] �� ������ �����͸� ��ü�϶�.
 *  a:1, b:2 --> a:2, b:1
 */