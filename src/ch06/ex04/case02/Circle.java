package ch06.ex04.case02;

public class Circle {
	private int x;  //x좌표
	private int y;  //y좌표
	private int r;  //반지름
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", x, y, r);
	}
}

//@Override쓰는이유 : 실수방지
//멤버변수에 계산된 값을 두면 안된다.
