package ch06.home.ex04.case3;

public class Dot {
	public int x;
	public int y;
	
	public Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
}	
