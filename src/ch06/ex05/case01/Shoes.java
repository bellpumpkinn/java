package ch06.ex05.case01;

public class Shoes extends Product{
	private int price;
	
	
	public Shoes(int price) {   //�̷��� �ؾ� 3������ ������ �ȳ�.
		super(price); //���⼭ product�� ���� 2000���� ����.
		this.price = price; //����� ������� price
	}
}

//��üŸ���� ���������.
//�ڽ��� ��ӹ����� �θ� �� ������. �׷��� ���⼱ price�� 2������
