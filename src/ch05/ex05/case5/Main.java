package ch05.ex05.case5;
//A has a B ����������.
public class Main {
	public static void main(String[] args) {
		Apple apple = new Apple(); //����� �ϳ� ����.
		Basket basket = new Basket(); //�ٱ��� �ϳ� ����.
		
		basket.setApple(apple); //�ٱ��Ͽ� ����� ���.
		basket.getApple(); //�ٱ��Ͽ� ����� ������.
	}
}
