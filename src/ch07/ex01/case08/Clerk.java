package ch07.ex01.case08;

public class Clerk {
	public Flower sell(String flowerName) {
		Flower flower = null;
		
		switch(flowerName) { //리턴타입이 flower(인터페이스)라서 2개 가능
		case "백합": flower = new Lily(); break;
		case "장미": flower = new Rose(); 
		}
		
		return flower;
	}
}
