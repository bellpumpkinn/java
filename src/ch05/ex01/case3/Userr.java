package ch05.ex01.case3;
// 빈줄 우클릭 - > source -> generate getter and setter ->그리고 체크하고 generate 클릭
public class Userr {
	private String name;
	private int age;
	
	//getter
	public String getName() {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
/*
[캡슐화 하는 방법]
프라이빗 멤버변수
퍼블릭 게터 세터를 두면된다.
*/