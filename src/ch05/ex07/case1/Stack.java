package ch05.ex07.case1;

public class Stack {
	public static void first() {
		int a = 0; //first�ȿ� ���� a������ ���ÿ� ���δ�.
		Stack.second(); //second�� static�޼���� Ŭ����.������(�Ǵ� �޼����)���� �Է�.
	}
	//���� �ٸ� �޼��忡�� �����̸��� ������ �ᵵ �������.
	public static void second() {
		int a = 0;
	}
}
//����޼��忡�� �ٸ�����޼��带 ȣ���Ҷ� this�� ���δ�.
//this�� ��ü
//