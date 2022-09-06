package ch06.ex05.case02;

public class Animal {
	private int age;
	
	public Animal(int age) {
		this.age = 1000 * age;
	}
	
	public void shout() {
		System.out.println("으르릉.");
	}
	
	public int getAge() {
		return this.age;    //this의 타입: 애니멀 따라서 메인에서 1000이 나왔다.
	}
}
