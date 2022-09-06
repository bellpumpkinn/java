package ch07.ex04.case04;

public class Slot {
	private Ball[] balls; //공들을 담을수 있는 공간마련.
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1); //i가 0일때 1번공, 44일때 45번공
	}
	
	public Ball chuck() {   //토해내다. 객체를 주어로 두고 서술어를 메서드로 둔다.
		int i = 0;
		Ball ball = null;
		
		do {
			i = (int)(Math.random() * 45); // 0 ~ 44까지 해야함
			ball = balls[i]; 
			balls[i] = null;  
		} while(ball == null);	
	
		return ball;
	}
}
/*
이대로 하면 같은숫자가 중복해서 나올수있는 버그가 있다. 그래서 수정해야함.

public class Slot {
	private Ball[] balls; //공들을 담을수 있는 공간마련.
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1); //i가 0일때 1번공, 44일때 45번공
	}
	
	public Ball chuck() {   //토해내다.
		int i = 0;
		Ball ball = null;
		
			i = (int)(Math.random() * 45); // 0 ~ 44까지 해야함
			ball = balls[i];
		
		return ball;
	}
}


*/
/*

public class Slot {
	private Ball[] balls; //공들을 담을수 있는 공간마련.
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1); //i가 0일때 1번공, 44일때 45번공
	}
	
	public Ball chuck() {   //토해내다.
		int i = 0;
		Ball ball = null;
		
		do {
			i = (int)(Math.random() * 45); // 0 ~ 44까지 해야함
			ball = balls[i];
		} while(ball == null); //공이 선택이 안되면 계속 반복.
		
		return ball;
	}
}

*/
//