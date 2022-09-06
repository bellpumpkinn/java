package ch05.ex05.case5;

public class Basket {
	private Apple apple; // 사과가 있다. 멤버변수로 사과를 담는순간 사과바구니로됨.
	//A has B면 B를 멤버변수로 둔다.
	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

//객체안에 객체있는상태 A has a B.
//4번째줄의 의미 Basket has an Apple
//주어 has a 목적어면 목적어가 멤버변수다.
//Basket은 apple에 의존. 따라사 apple이 dependency.

