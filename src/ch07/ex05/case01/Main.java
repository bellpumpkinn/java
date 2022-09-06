package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket = new Basket<Apple>(); //이 객체안에서 E라고 써져있던게 Apple로 됨.
		basket.set(new Apple());
		System.out.println(basket.get());
		
		//basket.set(new Grape()); //지금 set애플인데 set그레이프를 했으니 불가능(에러가 뜸)
		
		Basket<Grape> basket2 = new Basket<Grape>(); //제너릭타입은 new 할때 결정
		basket2.set(new Grape());
		System.out.println(basket2.get());
	}
}
