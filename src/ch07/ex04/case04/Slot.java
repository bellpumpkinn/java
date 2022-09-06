package ch07.ex04.case04;

public class Slot {
	private Ball[] balls; //������ ������ �ִ� ��������.
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1); //i�� 0�϶� 1����, 44�϶� 45����
	}
	
	public Ball chuck() {   //���س���. ��ü�� �־�� �ΰ� ����� �޼���� �д�.
		int i = 0;
		Ball ball = null;
		
		do {
			i = (int)(Math.random() * 45); // 0 ~ 44���� �ؾ���
			ball = balls[i]; 
			balls[i] = null;  
		} while(ball == null);	
	
		return ball;
	}
}
/*
�̴�� �ϸ� �������ڰ� �ߺ��ؼ� ���ü��ִ� ���װ� �ִ�. �׷��� �����ؾ���.

public class Slot {
	private Ball[] balls; //������ ������ �ִ� ��������.
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1); //i�� 0�϶� 1����, 44�϶� 45����
	}
	
	public Ball chuck() {   //���س���.
		int i = 0;
		Ball ball = null;
		
			i = (int)(Math.random() * 45); // 0 ~ 44���� �ؾ���
			ball = balls[i];
		
		return ball;
	}
}


*/
/*

public class Slot {
	private Ball[] balls; //������ ������ �ִ� ��������.
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1); //i�� 0�϶� 1����, 44�϶� 45����
	}
	
	public Ball chuck() {   //���س���.
		int i = 0;
		Ball ball = null;
		
		do {
			i = (int)(Math.random() * 45); // 0 ~ 44���� �ؾ���
			ball = balls[i];
		} while(ball == null); //���� ������ �ȵǸ� ��� �ݺ�.
		
		return ball;
	}
}

*/
//