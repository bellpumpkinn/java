package ch07.ex01.case01;
//������
public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c;
		
		c = (C)a; //Ÿ�� - ��ü�� ��� ������ ��ü�� Ŭ������ �̸����� �ٲٰ� �ִ°�.
		c = (C)b; //ĳ����
		
		b = (B)a;
		
		// String s = (String)c; //��ü�� ��������������Ÿ�����δ� ĳ���úҰ�
	}
}


// A > B > C(����Ÿ��,������) -> ���θ��

/*
ĳ������ �ش簴ü�� �������ִ� Ÿ�Գ������� �����ϴ�.

*/