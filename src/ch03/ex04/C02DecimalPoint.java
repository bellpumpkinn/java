package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0; //�Ҽ������� ���ڸ��� ����°�
		System.out.println(shortPi); // 3.1�� ���.
		
		shortPi = (int)(pi * 1000) / 1000.0; //0�� ������ �Ҽ��� �ڸ�����.
		System.out.println(shortPi); //����]��°������ 3.141�� �ǵ����϶�.
		
		shortPi = Math.round(pi * 1000) / 1000.0; //�Ҽ������� ���ڸ��� ����°�
		System.out.println(shortPi); //����]3.142�� �ǵ����϶�.
	}
}
