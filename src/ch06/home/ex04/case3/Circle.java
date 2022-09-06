package ch06.home.ex04.case3;

public class Circle {
	private Dot dot;  //멤버변수는 특별한요구사항없으면 private으로 한다.
	private int r;
	
	public Circle(Dot dot, int r) {
		//dot = new Dot(x, y); 이것도 가능하고
		this.dot = dot;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.dot , this.r);
	}
}


//Circle extends Dot이 부분이 나쁜코드인데 리팩토링해라

//circle has a dot으로 리팩토링.
//객체는 데이터다.