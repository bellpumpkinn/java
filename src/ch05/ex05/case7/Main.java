package ch05.ex05.case7;

public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		retailer.sell(farmer.sell(1000));
		//농부가 사과를 하나 수확, 천원가격표붙이고, 유통업자넘기고, 유통업자는 2000원붙이고 팔았다.
	}
}
//내가 감독
//파머와 리테일이 배우, 사과가 소품
//사과는 파머가 만듬