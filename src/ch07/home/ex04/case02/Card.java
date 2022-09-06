package ch07.home.ex04.case02;

public class Card {
	public int num;
	
	public Card(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return this.num + " ";  //int를 String으로 바꾸려면 뒤에 + " ";를 붙여준다.
	}
	
}
