package ch06.ex03.case02;

public class Cat extends Animal {
	@Override    // annotation(주석)이라고 부른다.    //<-이거는 comment(주석)
	public void shout() { //오버라이드는 선언문을 똑같이한다.
		System.out.println("야옹야옹");
	}
	
}
// @가 붙어있는거는 오버라이드가 발생한거라고 컴파일러한테 읽으라고(알라고) 쓰는거다.
