package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus();
		
		Tree tree = new Platanus(); //이 플라타너스를 나무로 봐야지 하고 나무가 한그루있네.
		platanus = (Platanus)tree; //야 저 나무는 플라타너스야 라고하는상황
		
		tree = platanus;
		tree = (Tree)platanus;
	}
}	
