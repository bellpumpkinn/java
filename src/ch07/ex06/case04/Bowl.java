package ch07.ex06.case04;

public class Bowl<T> {
	private T val;
	
	public void setVal(T val) {
		this.val = val;
	}
	
	public T getVal() {
		return this.val;
	}
}

//제네릭타입이 포함된 클래스를 제네릭클래스
//new 할때 결정한다.
