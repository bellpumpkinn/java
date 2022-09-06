package ch05.ex02.case1;

public class Box {
	private int a;
	private int b;
	//int getA는 메서드 선언부
	public int getA() {    // {}부분은 공개가 안된다.
		return a;
	}
	//return타입은 메서드가 끝났을떄 나와야할 데이터타입.
	public int getB() {
		return b;
	}
	
	public void setA(int a) {
		this.a = a;  // this를 안쓰면 컴파일러는 a를 다 지역변수로봄.
	}				//this.a를 멤버변수 a로 보면 된다.

	public void setB(int b) {
		this.b = b;
	}	
}
// 메서드를 사용하면서 중복코드 제거.
// 클래스의 목적 - 중복코드 제거.
// 객체 생성목적 - 주어를 나타날때 필요하기떄문, 중복코드가 최소화됨.
// 데이터를 담아두는거 - 도메인