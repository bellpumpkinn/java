package ch05.home.ex05.case8;

public class Main {
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Ball ball = new Ball(); //공이 하나 생김.
		
		player1.setName("최한석");
		player2.setName("한아름");
		player3.setName("양승일");
		
		player3.shoot(player2.pass(player1.pass(ball)));
	}
}

/*
최한석, 한아름, 양승일이 축구를 한다.
한석이가 아름이한테 공을 패스한다.
아름이는 승일이한테 공을 패스한다.
승일이는 공을 찬다.
*/