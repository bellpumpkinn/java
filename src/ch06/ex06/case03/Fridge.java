package ch06.ex06.case03;

public class Fridge implements Appliance{
	@Override
	public void on() {
		System.out.println("냉장고를 켜다.");
	}
	
	@Override
	public void off() {
		System.out.println("냉장고를 끄다.");
	}
}

/*
일반 클래스를 상속할 때는 상속 키워드 extends를 사용한다.
인터페이스를 상속할 때는 상속 키워드 implements를 사용한다.
근데 오류가 나기때문에 오버라이드를 해줘야 한다.

그리고  인터페이스를 상속받은 자식 클래스는 인터페이스의 모든 필드, 메서드를 누락없이 구현하여야 한다.
만약에 위에서 void off()를 안쓰면 에러가 난다.
*/