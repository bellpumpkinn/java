package ch06.home.ex03.case3;

public class User {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		//return name + " " + age + "��";
		return String.format("%s %d��", name, age);
	}
}

