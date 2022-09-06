package ch06.ex04.case01;

public class Cat extends Animal {
	private int age;
	
	public Cat(String name, int age) {
		//super();
		super(name); //부모클래스 Animal String으로부터 호출
		//this.name = name; //Animal클래스의 name이 private이기때문에 에러
		this.age = age;
	}
	
		public int getAge() {
			return this.age;
		}
		
}


//public Cat(){}이 생성자는 기본적으로 자동생성되는데 얘가 에러다
//그래서 public class >Cat< 컴파일에러
//해결방법은 super호출문 -> 부모의 생성자를 호출
//부모의 생성자에도 똑같이 셋팅해줘야함
//다형성