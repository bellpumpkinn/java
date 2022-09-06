package ch06.ex05.case01;

public class Product {
	private int price;
	
	public Product(int price) {
		this.price = price * 2;
	}
	
	public int getPrice() {
		return this.price;
	}
}

//데이터타입이 다르다.
//Product의 this와 Shoes의 this는 데이터타입이 다른다.