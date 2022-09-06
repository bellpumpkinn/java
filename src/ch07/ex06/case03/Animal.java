package ch07.ex06.case03;
//Factory메서드
public interface Animal {
	default void eat() {
		System.out.println("먹다.");
	}
	
	void move();
}

//default메서드를 쓰면 바디를 넣을수가 있다.
//그리고 default메서드는 오버라이드를 안해도 된다.