package ch07.ex04.case02;

public class Shuffle {
	public static void main(String[] args) {
		int[] cards = new int[5]; //ī�带 ������ �ִ� ���� 5�� �غ�.
		
		for(int i = 0; i < cards.length; i++) cards[i] = i;
		
		for(int i: cards) System.out.print(i + " ");
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * 4) + 1; //1���� 4����.
			
			int temp = cards[0]; //0��°ī��� ������ī�带 ����.
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


//7������ cards[i] = i;�� card 5�� �־��ִ°�
/*
0���� �Ǿտ� �־ 1���� 0���� �̷������� ���´�.
*/