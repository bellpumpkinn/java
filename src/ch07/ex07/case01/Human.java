package ch07.ex07.case01;
//람다.

@FunctionalInterface
public interface Human { // @FunctionalInterface붙이면 Human은 람다가 됐다.
	void say();
	//void tell();   메서드를 하나밖에 못만든다. 여러개 불가능.
}

//람다 - 메서드를 데이터로 본다.
//say()메서드가 데이터고 say메서드의 데이터타입은 Human이다.