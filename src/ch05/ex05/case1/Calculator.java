package ch05.ex05.case1;
//�����ε� - �ϳ��� Ŭ������ �̸��� ���� �Ķ���Ͱ� �ٸ� �޼��带 2���̻� �����ѰŸ� ���Ѵ�.
public class Calculator {
	public int add(int a, int b) { //transparent
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
//(int a, int b) add�� �����Ҷ� ����. parameter�����.
