package ch06.ex05.case02;

public class Dog extends Animal{
	private int age;
	
	public Dog(int age) {
		super(age);    //�ִϸַΰ��� age�ȿ� ��
		this.age = age;  //����Ŭ������ age�� 1�� ��
	}
	
	/*@Override
	public int getAge() {
		return this.age;  //���⼭ this�� Ÿ���� Dog
	}*/
}
