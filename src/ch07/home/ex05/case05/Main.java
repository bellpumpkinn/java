package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot();
		List<Ball>balls = new ArrayList<>(); 
		
		for(int i = 0; i < 6; i++)
			balls.add(slot.chuck());

		for(Ball ball: balls)
			System.out.print(ball.getNum() + " ");
			/*//오버라이드쓰는경우 ↓
			System.out.print(ball);
			*/
	}
}

/*
ch07.ex04.case04 로또이야기를 리팩토링해라.
*/