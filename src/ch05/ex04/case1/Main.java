package ch05.ex04.case1;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d", Card.width, Card.height);
		
		Card.width = 10;
		Card.height = 20;
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("\n%s, %s\n", card1.kind, card2.kind);
		
		System.out.printf("\n%d, %d\n", Card.width, Card.height); //static������ �̷��� ���.
		System.out.printf("\n%d, %d\n", card1.width, card1.height); //static�ε� �̷��� ����.
		
		card1.width = 100;
		System.out.printf("\n%d, %d\n", card1.width, card2.width);
	}
}
//Card.width => CardŬ������ �ִ� width�̴�.
//width, height�� �ʵ�(�������)�̱⶧���� �̹� �ʱⰪ 0�� �������ִ�.
//kind�� number�� �ν��Ͻ������� ����Ʈ�� ����ó�� �ٷ� �������Ѵ�. ��ü�� ���� ����� ��������.
//static������ �Ⱦ��� �ߺ��� �߻�
//50��,100�� ���� width, height �����Ͱ� �ߺ��� �߻��ϴϱ� static���� ���
//static�������� Ʈ���̵���� �����ؾ���