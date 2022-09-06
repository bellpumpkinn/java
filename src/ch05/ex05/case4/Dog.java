package ch05.ex05.case4;

public class Dog {
	private String name;
	private String breed; //종
	//개가 밥먹고 난뒤에 하는 행동이 없다면 void
	public void eat() {}
	//짖고나서 하는 행동이 없구나. 그럼 빠져나오니까 void
	//public int eat()  {return 0} ->> int형이면 이렇게
	public void shout() {}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
//속성 명사는 멤버변수, 속성 동사(동작)은 멤버메서드
