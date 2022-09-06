package ch07.home.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Card[] cards = new Card[5]; //ī�尡 5�� �����ִ°��� Ȯ��.
		
		for(int i = 0; i < cards.length; i++) 
			cards[i] = new Card(i);  //ī�带 5�� ���� ����.
		
		for(Card card: cards) System.out.print(card);
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * 4) + 1; //1���� 4����.
			
			Card temp = cards[0];
			cards[0] = cards[idx];
			cards[idx] = temp;
		}
		for(Card card: cards) System.out.print(card);
	}
}

/*
ch07.ex04.case02.Shuffle�� OOP�� refactoring �϶�.
*/