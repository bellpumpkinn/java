package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true; //true
		b = (2 > 1) && (2 > 1); //�񱳿� ���� ������ �񱳿����ڸ� ���� ����. true
		b = (2 < 1) && (2 > 1); //�ϳ��� false�� ������ false
		b = (2 < 1) || (2 > 1); //�ϳ��� true�� true
		b = (2 < 1) || (2 < 1); //false
		System.out.println(b);
		
		int x = 0; //&&�����ص�
		int y = 0;
		b = ++x < 0 && ++y <0; //false ,&&�� true,true���� true�� �������� �� false.
		//ù ++x < 0 �� false�� ������ false�ϱ� y = 0 �� �״�� ����.
		System.out.printf("x: %d, y: %d, b: %b", x, y, b); //boolean�� %b�� ��.
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y <0; //�׳� &���� y=1�� ����
		System.out.printf("\nx: %d, y: %d, b: %b", x, y, b);
		
		x = 0; //||���� or�� ó���� false�� �ڵ� ����Ѵ�.
		y = 0;
		b = ++x < 0 || ++y < 0;
		System.out.printf("\nx: %d, y: %d, b: %b", x, y, b);
		
		x = 0; //||���� or �� ó���� true�� ������ ������� true �޺κ��� �����Ѵ�. 
		y = 0; // �޺κ� �����ϴϱ� �۾��ð��� ���� ����or��� �Ѵ�.
		b = ++x > 0 || ++y < 0;
		
		System.out.printf("\nx: %d, y: %d, b: %b", x, y, b);
		//&&(�����ص�),||(����or) ���� �ȴ�.
		//�����ٴ°��� request������ response�� �����ٴ°��� ����.
	}
}    
