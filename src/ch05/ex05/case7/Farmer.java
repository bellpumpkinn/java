package ch05.ex05.case7;

public class Farmer {   //   ↓    
	public Apple sell(int price) {
		Apple apple = new Apple(); //사과를 하나 땄다.
		apple.setPrice(price); // 가격표를 붙인다.
		
		return apple;
	}
}
