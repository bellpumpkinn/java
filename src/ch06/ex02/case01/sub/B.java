package ch06.ex02.case01.sub;

import ch06.ex02.case01.A; //��ι����� �ذᰡ��.

public class B {
	public void test() { //test�� B��ü�� �����ϴ°� ������ �Ѵ�.
		//ch06.ex02.case01.A a = new ch06.ex02.case01.A(); // �ٵ� �� �Ⱦ�
		A a = new A(); //import�� �ذᰡ��. �ƴϸ� Ŭ������ Ǯ������ �� ������ �ִ�.
		
		int x = 0;
		//x = a.a; //private�� �ش� ��ü�������� ��밡���ϱ⶧���� ����.
		//x = a.b; //defalut : ������Ű���� ������ �Ǵµ� �ٸ���Ű���� ������ �ȵȴ�.
		//x = a.c; //protected: ���������� �ٸ���Ű���� ������ ������ �ȵȴ�.
		x = a.d; //public �� �� �ȴ�.
		
		//a.m1();
		//a.m2();
		//a.m3();
		a.m4();    //public�� �ٸ���Ű���� �� ���� ����.
	}
}
