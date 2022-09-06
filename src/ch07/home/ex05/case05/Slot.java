package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Slot {
	private List<Ball> balls; 
	
	public Slot() {
		balls = new ArrayList<>();
		
		for(int i = 1; i <= 45; i++)
			balls.add(new Ball(i)); 
	}
	
	public Ball chuck() {   
		int i = (int)(Math.random() * balls.size()); //balls.size는 유동적으로 바뀐다.
		return balls.remove(i); //remove할때마다 사이즈가 1씩 줄어듬.
	}
	
	
}


//리스트는 length 말고 size를 쓴다. 17번줄 참조

//로또 백지상태에서 만들정도로 하면 좋음. 리스트 제너릭타입 섭렵하게됨.