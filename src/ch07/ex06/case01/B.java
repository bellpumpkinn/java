package ch07.ex06.case01;

public class B /*extends A*/{ //A 상속받는게 불가능. A는 final이라서 불가능.
	public final void say() {}
}

//final은 마지막이라고 생각.
//누군가가 변경하는것도 싫고 그냥 마지막으로 이거다. 라 했을때 씀.
//final메서드는 오버라이드가 안된다.