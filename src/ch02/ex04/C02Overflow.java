package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128; �����Ͽ�����
		byte b = 127;
		//b = b + 1; ��ǻ�Ͱ� ������ ����
		
		b++; //�ܻܿ����� : �����͸� �а� 1�� ������Ų��.
		b++;
		System.out.println(b);
	}
}	
