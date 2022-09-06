package ch05.ex05.case9;

public class Cat {
	private String name;
	
	public Cat breed() {
		return new Cat(); //엄마고양이가 새끼고양이를 낳다.
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
