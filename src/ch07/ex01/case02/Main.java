package ch07.ex01.case02;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c;
		Object o = c;   //extends Object�� �����ȰŴϱ� �׻�����
		
		c = (C)o;
		c = (C)a;
		c = (C)b;
		
		b = (B)o;
		b = (B)a;
	}
}


//����⸦ root��� �ϴµ� ���⿡�� extends Object�� ����