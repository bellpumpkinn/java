package ch05.ex07.case2;

public class Stack {
	public static void first() {
		System.out.println("Stack.first() ����.");
		int a = 0; //first�ȿ� ���� a������ ���ÿ� ���δ�.
		Stack.second(); //second�� static�޼���� Ŭ����.������(�Ǵ� �޼����)���� �Է�.
		System.out.println("Stack.first() ��.");
	}
	//���� �ٸ� �޼��忡�� �����̸��� ������ �ᵵ �������.
	public static void second() {
		System.out.println("Stack.second() ����.");
		int a = 0;
		System.out.println("Stack.second() ��.");
	}
}
//����޼��忡�� �ٸ�����޼��带 ȣ���Ҷ� this�� ���δ�.
//this�� ��ü
//