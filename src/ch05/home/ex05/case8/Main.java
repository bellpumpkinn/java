package ch05.home.ex05.case8;

public class Main {
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Ball ball = new Ball(); //���� �ϳ� ����.
		
		player1.setName("���Ѽ�");
		player2.setName("�ѾƸ�");
		player3.setName("�����");
		
		player3.shoot(player2.pass(player1.pass(ball)));
	}
}

/*
���Ѽ�, �ѾƸ�, ������� �౸�� �Ѵ�.
�Ѽ��̰� �Ƹ������� ���� �н��Ѵ�.
�Ƹ��̴� ���������� ���� �н��Ѵ�.
�����̴� ���� ����.
*/