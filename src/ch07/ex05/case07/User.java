package ch07.ex05.case07;

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


/*
리스트와 맵은 키와 밸류로 관리한다
리스트는 자동으로 해줌.
맵은 키까지도 내가 직접 구현해야한다.
*/