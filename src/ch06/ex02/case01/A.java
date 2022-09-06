package ch06.ex02.case01;

public class A {
	private int a; //감추고 싶으면 private쓰면된다. A객체안에서만 사용가능하기때문에.
	int b;
	protected int c;
	public int d;
	
	private void m1() {}
	void m2() {}
	protected void m3() {}
	public void m4() {}  
}
//access identifier(접근제한자)

//a, b, c, d 다 객체 안에 있다.
//m1과 m4는 객체안에 없다.(피지컬하게는) 메서드에어리어에 있다.
//로지컬하게는 객체에 있다.