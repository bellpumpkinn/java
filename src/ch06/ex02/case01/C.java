package ch06.ex02.case01;

public class C extends A {
	public void test() {
		int x = 0;
		
		//x = this.a; // private�̴� �ڽ��̶� ���ǵ��. ������ �ش簴ü������ ��밡��.
		x = this.b;
		x = this.c;
		x = this.d;
		
		
		// this.m1(); // �ڽ��̶� private�� ���θ� ��밡��.
		this.m2();
		this.m3();
		this.m4();
	}
}

//this.b�� a��ü.b�̴�. �ֳ��ϸ� A�� C�� �θ�Ŭ�����ϱ�.
//private�� ���ٸ��ϰ� �ٸ��� �� ����.