package ch07.ex04.case02;

public class Shuffle {
	public static void main(String[] args) {
		int[] cards = new int[5]; //카드를 넣을수 있는 공간 5장 준비.
		
		for(int i = 0; i < cards.length; i++) cards[i] = i;
		
		for(int i: cards) System.out.print(i + " ");
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * 4) + 1; //1부터 4까지.
			
			int temp = cards[0]; //0번째카드와 나머지카드를 섞음.
			cards[0] = cards[idx]; 
			cards[idx] = temp;
		}
		
		for(int i : cards) System.out.print(i + " ");
	}
}
/*
i = 0    idx = 1
temp = 0, cards[0] = 1, cards[1] = 0;
 */


//7번줄의 cards[i] = i;는 card 5장 넣어주는거
/*
0번이 맨앞에 있어서 1번을 0번에 이런식으로 섞는다.
*/