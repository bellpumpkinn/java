package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c); // int*int = int�� �Ǽ� �����÷ο춧���� ���� �ٸ��� ����.
		
		c = (long)a * b;	//�ذ�å : long���� casting���ش�.
		System.out.println(c); //10��
		
		int x = a * b / a;  //a*b���� �̹� �����÷ο찡 �Ͼ�⶧���� a�� ������ �����÷ο찡 ��ä�� ����.
		System.out.println(x);
		
		x = a * (b / a);  //a*b�� �����÷ο�Ǵϱ� �����⸦ �����ϰ� ���Ѵ�.
		System.out.println(x);
	}
}
