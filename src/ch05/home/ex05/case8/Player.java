package ch05.home.ex05.case8;

public class Player {
	private String name; //�÷��̾��� �̸�

	public Ball pass(Ball ball) {  //�н������� ���� Ƣ������ϴϱ� Ball ball
		return ball; //�������� �״�� ����ϴϱ� new ball�� �ƴ� ball�� �� 
	}
	
	public Ball shoot(Ball ball) { //�� á���� ���� Ƣ�� �������ϴϱ� Ball ball
		return ball;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
//��ü�� �������̱� ������ �Ķ����, ����Ÿ������ �����ִ�.