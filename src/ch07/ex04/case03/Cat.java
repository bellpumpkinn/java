package ch07.ex04.case03;

public class Cat {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() { //println했을때 구분하기 쉬움.
		return this.name;
	}
}
