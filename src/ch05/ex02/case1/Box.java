package ch05.ex02.case1;

public class Box {
	private int a;
	private int b;
	//int getA�� �޼��� �����
	public int getA() {    // {}�κ��� ������ �ȵȴ�.
		return a;
	}
	//returnŸ���� �޼��尡 �������� ���;��� ������Ÿ��.
	public int getB() {
		return b;
	}
	
	public void setA(int a) {
		this.a = a;  // this�� �Ⱦ��� �����Ϸ��� a�� �� ���������κ�.
	}				//this.a�� ������� a�� ���� �ȴ�.

	public void setB(int b) {
		this.b = b;
	}	
}
// �޼��带 ����ϸ鼭 �ߺ��ڵ� ����.
// Ŭ������ ���� - �ߺ��ڵ� ����.
// ��ü �������� - �־ ��Ÿ���� �ʿ��ϱ⋚��, �ߺ��ڵ尡 �ּ�ȭ��.
// �����͸� ��Ƶδ°� - ������