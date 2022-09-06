package ch05.home.ex05.case6;

public class Phone {
	private String makerName; //maker는 객체, makerName은 속성
	private int price;
	
	public void sendMsg() {}
	public void call() {}
	public void playGame() {} //메서드이름은 동사를 써야한다.
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}
}
//최한석 has a 폰이기 때문에 폰을 먼저 디자인한다.
