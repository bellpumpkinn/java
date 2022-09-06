package ch07.ex07.case02;

@FunctionalInterface
public interface Human {
	void say();
	
	static void walk() {
		System.out.println("Human walk.");
	}
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
}

/*
 *인터페이스가 가질수있는 추상메서드가 아닌 메서드
 *디폴트메서드, 스태틱메서드 
 * 휴먼이 람다라하더라도 엄연히 클래스고, 엄연히 데이터타입으로 쓰임.
 * 부모클래스로도 쓰일수 있다.
 */