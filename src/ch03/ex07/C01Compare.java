package ch03.ex07;
//�񱳿�����
public class C01Compare {
	public static void main(String[] args) {
		boolean b = 'A' < 'B'; //true�� ��µ�.
		b = '0' == 0; //false   0�� �����ڵ� 48, a�� �����ڵ� 97
		b = 'A' != 65; //false    A�� 65�̱� ����.
		
		b = 10.0 == 10.0f; //true
		b = 0.1 == 0.1f; //false  0.1f �� 0.100000000004921�̱⶧��, �ڸ����� ���̸� �ذ�
		b = (float)0.1 == 0.1f; //true
		
		System.out.println(b);
	}
}
