package ch07.ex04.case04;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot(); //슬롯만 준비하면 공이 알아서 준비돼있다.
		Ball[] balls = new Ball[6]; //슬롯에서 토해낸 6개를 넣을 공간마련.
		
		for(int i = 0; i < 6; i++)
			balls[i] = slot.chuck();
		
		for(Ball ball: balls)
			System.out.print(ball.getNum() + " ");
	}
}	
