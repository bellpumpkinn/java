package ch09.ex03;
//싱크로나이즈 사용법
public class Counter {
	private int val;
	
	public synchronized void increase() {
		val++;
	}
	
	public synchronized void decrease() {
		val--;
	}
	
	public synchronized void print() {
		System.out.print(val + " ");
	}
}


//여러데이터가 공유하는 counter 될예정
//val++이 동시에 이뤄지는걸 막아주는걸 싱크로나이즈


