package ch06.ex06.case08;

public class Main {
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Goose goose = new Goose();
		
		elephant.eat();
		goose.eat();
		
		elephant.move();
		goose.move();
	}
}

//디폴트메소드로 인해 디자인이 풍부해졌다.
//디폴트메소드의 목적 - 코드중복 최소화

/*
<인터페이스의 default 메서드>
-이미 만들어진 인터페이스에 메서드를 추가할 때 사용한다.
-메서드 앞에 default 키워드 추가
-오버라이팅 가능
-상속받은 클래스는 인터페이스의 default 메서드를 반드시 오버라이딩할 필요는 없다.
-접근 지정자는 자동적으로 public 추가된다.
*/