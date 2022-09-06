package ch06.ex05.case02;

public class Dog extends Animal{
	private int age;
	
	public Dog(int age) {
		super(age);    //애니멀로가서 age안에 들어감
		this.age = age;  //도그클래스의 age에 1이 들어감
	}
	
	/*@Override
	public int getAge() {
		return this.age;  //여기서 this의 타입은 Dog
	}*/
}
