package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
		
		//x = this.a;
		//x = this.b; //����Ʈ ������Ƽ���� �������� �ٸ���Ű���� ������ �Ⱥ���.
		x = this.c; // ������ �ٸ���Ű���� �ڽ��̸� �����ִ°Ŵ� protected
		x = this.d;
		x = this.d;
		
		//this.m1();
		//this.m2();
		this.m3(); //�ڽ��̶� ���δ�.(protected ����������)
		this.m4();
	}
		
		
}
