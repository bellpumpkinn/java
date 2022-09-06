package ch07.ex06.case02;

public class Alien extends Life{
	//@Override 안됨.
	public static void eat() {
		System.out.println("Alien 먹다.");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien 소리치다.");
	}
}


//static메서드는 오버라이드 안됨. 상속이 안된다.
//static메서드는 상속되는게 아니다.
//인스턴스멤버변수, 메서드는 상속이 된다.