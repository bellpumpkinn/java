package ch07.ex03.domain;

public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}


//3계층을 나누는 이유
/*
마이바티스 이용하면 데이터베이스쓰면 코드가 달라질때

*/