package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.52;
		int i = (int)d;	
		System.out.printf("%d, %f\n", i, d);
		
		double f = Math.floor(d); //floor�� ����ó���ؼ� 1.0 �ǹ�
		double r = Math.round(d); //round�� �ݿø�ó���� �ؼ� 2.0�� ��Ÿ��
		
		System.out.printf("%f, %f", f, r);
		}
}	
