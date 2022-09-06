package ch05.ex01.case3;
//encapsulation(캡슐화) - 감추고싶을때씀
public class User {
	private String name; //private은 감춘다는말이 포함되는거
	private int age;
	
	// void : 메서드가 실행되고 나면 리턴되는값은 없다는 의미 / 메서드이름은 동사로 나타내기.
	public void setName(String name) {
		this.name = name; //this가 없으면 멤버변수에 접근할수없으니까 붙임.
	}
	
	//이런 메서드를 setter라고 부른다.
	public void setAge(int age) {
		this.age = age;
	}
	
	//이런 메서드를 getter라고 부른다.
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

//setName에 있는 name변수는 메서드블록안에서 선언된걸로 인식(스택에 생김)
//맨위의 name은 heap에 생김.
//this.name은 멤버변수라는걸 알려주려고 this를 붙임
//this를 멤버라고 생각하면됨
//this.name은 멤버변수 name이라고 부르면됨.
/*
	void setName(String name) // 메서드 선언부 { //
		
	}
	void setAge(int age) {
		this.age //멤버변수 age = age;//파라미터 age
	}
메서드는 리턴값이 있는거과 없는거
void = 리턴값이 없는거
리턴값이 있다 = 리턴값의 타입
*/