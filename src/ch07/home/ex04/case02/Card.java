package ch07.home.ex04.case02;

public class Card {
	public int num;
	
	public Card(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return this.num + " ";  //int�� String���� �ٲٷ��� �ڿ� + " ";�� �ٿ��ش�.
	}
	
}
