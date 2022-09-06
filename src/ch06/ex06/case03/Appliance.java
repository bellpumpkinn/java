package ch06.ex06.case03;

public interface Appliance {
	void on(); //컴파일러가 자동으로 붙여주니까 이렇게 써도 상관없다.
	void off(); //앞에 public abstract가 생략.
}

/*
인터페이스 - 표준의 역할.(인터페이스에서 정의한 멤버메서드를 자식이 오버라이드해서 따름)
모든 필드가 public static final로 지정된다. 안써도 컴파일러가 자동으로 붙여줌.
모든 메서드가 public abstract로 지정된다. 안써도 컴파일러가 자동으로 붙여줌.
자체적으로 객체를 생성할 수 없다.(추상적이기 때문)
*/

//바디가 없으면 추상메소드다.