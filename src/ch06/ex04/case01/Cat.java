package ch06.ex04.case01;

public class Cat extends Animal {
	private int age;
	
	public Cat(String name, int age) {
		//super();
		super(name); //�θ�Ŭ���� Animal String���κ��� ȣ��
		//this.name = name; //AnimalŬ������ name�� private�̱⶧���� ����
		this.age = age;
	}
	
		public int getAge() {
			return this.age;
		}
		
}


//public Cat(){}�� �����ڴ� �⺻������ �ڵ������Ǵµ� �갡 ������
//�׷��� public class >Cat< �����Ͽ���
//�ذ����� superȣ�⹮ -> �θ��� �����ڸ� ȣ��
//�θ��� �����ڿ��� �Ȱ��� �����������
//������