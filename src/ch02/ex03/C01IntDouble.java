package ch02.ex03; //����ȯ

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i; // ĳ�������� promotion 
		System.out.printf("%f, %d\n", d, i);
		
		d = (double)i; //��ȣ�� ĳ���� ������.
		//�Ҵ翬���ڰ� �����ϴ°��� ĳ���ÿ����ڰ� �����ϴ°��� ����
		//1�� double�� 1.0000������ �� ���� �Ҵ翬���ڰ� ����.
		System.out.printf("%f, %d\n", d, i);

		//i = d; ����.�ذ�å�� 17��
		i = (int)d;
		System.out.printf("%f, %d\n", d, i);
	}
}
