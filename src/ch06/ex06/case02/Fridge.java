package ch06.ex06.case02;

import ch06.ex06.case01.Appliance;

public class Fridge extends Appliance {
	//Appliance의 멤버메소드는 fridge에 상속이 됐다.
	@Override
	public void on() {
		System.out.println("냉장고를 켜다.");
	}
}
//Fridge - 냉장고
//추상클래스는 객체를 만들지 못한다.
//그래서 추상클래스 하나만 일단 만들어 놓고 따로 객체를 만들 클래스를 생성.
//추상클래스를 상속받은 자식 클래스는 반드시 부모의 추상메서드를 Overriding해야 한다.
//추상클래스의public void on을 자식클래스인 Fidge가 그대로 썼다.