package ch06.home.ex04.case3;

public class Circle {
	private Dot dot;  //��������� Ư���ѿ䱸���׾����� private���� �Ѵ�.
	private int r;
	
	public Circle(Dot dot, int r) {
		//dot = new Dot(x, y); �̰͵� �����ϰ�
		this.dot = dot;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.dot , this.r);
	}
}


//Circle extends Dot�� �κ��� �����ڵ��ε� �����丵�ض�

//circle has a dot���� �����丵.
//��ü�� �����ʹ�.