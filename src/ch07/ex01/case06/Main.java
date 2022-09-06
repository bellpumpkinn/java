package ch07.ex01.case06;

public class Main {
	public static void main(String[] args) {
		Human human = new Student();
		human.sleep();
		
		Student student = (Student)human;
		student.study();
		student.sleep();
	}
}

/*
객체클래스에 존재하는 메서드는 쓸수있고 없는거는 못쓴다.
extends도 따라가서 확인한다.
객체를 자식타입으로 두면 다 쓸수있어서 편하다.
특별한 경우에만 부모타입으로 바꾼다.
타입에 걸맞는 행동을 하려고 타입을 바꾼다(프로모션, 캐스팅).
*/