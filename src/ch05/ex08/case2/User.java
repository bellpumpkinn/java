package ch05.ex08.case2;
//this의 정체.
import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate regDate;
	
	public User() {} // User user = new User(); 이거 그대로 쓰려면 이거를 오버로딩해주면됨.
	
	public User(String name, int age, LocalDate regDate) {
		this.name = name; //객체.멤버변수 인데 this안에는 User타입의 객체가 있다. 이건 VM이 알아서 해줌.
		this.age = age;
		this.regDate = regDate;		
	} //이렇게 생성자를 써주면 User user = new User(); <- 이부분을 채워줘야한다.

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public LocalDate getRegDate() {
		return regDate;
	}
}	

/*
this라는것은 변수다.
User라는 클래스안에서쓰니까 this변수의 데이터타입은 클래스 이름인 User이다.
*/