package ch05.ex05.case5;

public class Basket {
	private Apple apple; // ����� �ִ�. ��������� ����� ��¼��� ����ٱ��Ϸε�.
	//A has B�� B�� ��������� �д�.
	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

//��ü�ȿ� ��ü�ִ»��� A has a B.
//4��°���� �ǹ� Basket has an Apple
//�־� has a ������� ����� ���������.
//Basket�� apple�� ����. ����� apple�� dependency.

