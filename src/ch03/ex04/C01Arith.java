package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		// byte c = a + b;  ��������.  ����Ʈ������ ���� �ϴ°������� ������Ÿ���� int�� �ٲ���.
		// int + int = int ���� ��.
		//int���� ũ�Ⱑ ���� Ÿ���� int�� ��ȯ�Ѵ�.
		//(byte, char, short -> int)
		byte c = (byte)(a+b); //���Ѱ��� int���̴ϱ� byte�� ĳ������.
		//int ���־��������� byte�� ������ int�� �ٲ�ϱ� �׳� int�� ����.
		/*
		 * ���׿����ڴ� ������ �����ϱ����� �ǿ������� Ÿ���� ��ġ��Ų��. �׷��� ��갡��.
		  int���� ũ�Ⱑ ���� Ÿ���� int�� ��ȯ�Ѵ�.
		  (byte, char, short -> int)
		  
		  �ǿ����� �� ǥ�������� ū Ÿ������ ����ȯ�Ѵ�.
		  byte+short -> int + int -> int
		 */
		System.out.println(c);
		
		//c = c + 1; ����(Expression)�� ��������
		c++;
		System.out.println(c);
		//�������Ҷ� �Ѵ� int�ϱ� int�� �����. 
		double d = a / b; //���׿��� : �����÷ο춧���� (double)�Ⱥ��̸� 1.0����, ����ȯ
		System.out.println(d);
		
		/*
		 * [����]
		 * ���� ���׸� �ذ��ض�.
		 */
		
		d = (double) a / b; //a�� ����� ĳ������ �ǰ� b�� ������ double�̶� ����� ����.
		System.out.println(d);
		
		d = 1.0 * a / b; 	 // 1.0 * a ���� �ϸ� �������� �ǰ�, b�� ������ �ڵ����� ������ �ȴ�.
		System.out.println(d);	
		
		//���ۻ��
		
		d = (double)(a / b);  //��ȣ������ �����Ⱑ ���� ����Ǽ� intŸ������ �������. �ڴʰ� double�غ��� 1.0
		System.out.println(d);
		
		d = a / b * 1.0; // a / b �� int / int ���� ���Ǽ� 1.0�� ����
		System.out.println(d);
	}
}
