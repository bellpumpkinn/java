package ch07.ex04.case04;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot(); //���Ը� �غ��ϸ� ���� �˾Ƽ� �غ���ִ�.
		Ball[] balls = new Ball[6]; //���Կ��� ���س� 6���� ���� ��������.
		
		for(int i = 0; i < 6; i++)
			balls[i] = slot.chuck();
		
		for(Ball ball: balls)
			System.out.print(ball.getNum() + " ");
	}
}	
