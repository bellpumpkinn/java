package ch07.home.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Card[] cards = new Card[5]; //카드가 5개 들어갈수있는공간 확보.
		
		for(int i = 0; i < cards.length; i++) 
			cards[i] = new Card(i);  //카드를 5장 새로 만듬.
		
		for(Card card: cards) System.out.print(card);
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * 4) + 1; //1부터 4까지.
			
			Card temp = cards[0];
			cards[0] = cards[idx];
			cards[idx] = temp;
		}
		for(Card card: cards) System.out.print(card);
	}
}

/*
ch07.ex04.case02.Shuffle을 OOP로 refactoring 하라.
*/