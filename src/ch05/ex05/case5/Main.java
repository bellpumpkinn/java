package ch05.ex05.case5;
//A has a B 디자인패턴.
public class Main {
	public static void main(String[] args) {
		Apple apple = new Apple(); //사과를 하나 땄다.
		Basket basket = new Basket(); //바구니 하나 만듬.
		
		basket.setApple(apple); //바구니에 사과를 담다.
		basket.getApple(); //바구니에 사과를 꺼내다.
	}
}
