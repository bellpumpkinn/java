package ch05.ex02.case1;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setA(1); //상자의 A값에 1을 넣어야지
		box.setB(2); //상자의 B값에 2를 넣어야지 
		
		int result = box.getA() + box.getB();
		result = box.getA() - box.getB();
		
		System.out.println(result);
	}
}

// box.getA() -> 상자에서 A값을 꺼내야지
// box.getB() -> 상자에서 B값을 꺼내야지
// box를 도메인이라고 한다.
// 도메인은 데이터를 담는다 라는 관점으로 접근