package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket = new Basket<Apple>(); //�� ��ü�ȿ��� E��� �����ִ��� Apple�� ��.
		basket.set(new Apple());
		System.out.println(basket.get());
		
		//basket.set(new Grape()); //���� set�����ε� set�׷������� ������ �Ұ���(������ ��)
		
		Basket<Grape> basket2 = new Basket<Grape>(); //���ʸ�Ÿ���� new �Ҷ� ����
		basket2.set(new Grape());
		System.out.println(basket2.get());
	}
}
