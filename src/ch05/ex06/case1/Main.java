package ch05.ex06.case1;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java.");
		// Man.tell(""); 인스턴스메소드는 바로 불가능. 객체를 만들어야지 사용가능
		
		Man man = new Man();
		man.tell("I love java.");
		man.say("Hello"); //가능하긴하지만 경고를 받는다. 되도록 5째줄처럼 써라.
	}
}
//static메소드는 객체지향을 파괴하는것.
//누가하는지상관없고 뭐를하는지만 관심있을때 static 메소드를 쓴다.