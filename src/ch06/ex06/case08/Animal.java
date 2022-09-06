package ch06.ex06.case08;

public interface Animal {
	default void eat() {
		System.out.println("입으로 먹다.");
	}
	
	void move();
}

/*
인터페이스 안에서 바디가 있는 메소드를 default메소드라고 한다.

<인터페이스의 default 메서드>
-이미 만들어진 인터페이스에 메서드를 추가할 때 사용한다.
-메서드 앞에 default 키워드 추가
-오버라이팅 가능
-상속받은 클래스는 인터페이스의 default 메서드를 반드시 오버라이딩할 필요는 없다.
-접근 지정자는 자동적으로 public 추가된다.
-선언부뿐만아니라 알고리즘까지 표준화시킨거
*/

//알고리즘을 파악이 되면 메서드바디를 준비하고 바디가있는 메서드를 디폴트메서드

/*
static 메서드는 Animal.eat(); 이렇게 가능.
*/