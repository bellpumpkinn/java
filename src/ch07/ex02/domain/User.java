package ch07.ex02.domain;

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

//도메인은 그냥 데이터
//Dao I/o Service가 일을 한다.


//개발순서는 순서대로
//persistence layer               Dao
//service layer                   Service
//presentation layer              I/o

//사람들이 쓰는거는 반대로
