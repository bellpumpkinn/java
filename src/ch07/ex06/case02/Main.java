package ch07.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Life alien1 = new Alien();  //첫번째 외계인은 생명체로 본다.
		Alien alien2 = new Alien(); //두번쨰 외계인은 외계인으로 본다.
		
		alien1.eat();
		alien2.eat();
		
		alien1.shout(); //오버라이드된거는 자식꺼를 쓴다.
		alien2.shout(); //호출은 다 가능한데
		
		Life.eat();    //static변수, static메서드는 접두사로 클래스명을 쓰면 된다.
		Alien.eat();   //8,9번줄처럼쓰면 instance메서드로 왜곡할 가능성이 있다.
	}
}


/*
오버라이드문법
-> 오버라이드하면 자식의 메서드를 쓴다.

//static메서드는 오버라이드 안됨. 상속이 안된다.
//static메서드는 상속되는게 아니다.

static변수, static메서드는 접두사로 클래스명을 쓰면 된다.
*/