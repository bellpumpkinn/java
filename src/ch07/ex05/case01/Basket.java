package ch07.ex05.case01;
//<E> 가 제너릭.   <>를 다이아몬드라고 한다.
public class Basket<E> {   //아무거나 담을 수 있는 바구니.
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}

//Generic type.
//기생해서 존재
/*
제네릭과 맞지않는 객체의 타입이 올 경우 컴파일 에러가 발생하게 됨
*/