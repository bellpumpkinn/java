package ch07.ex01.case07;

public class Main {
	public static void main(String[] args) {
		Human human = new Human();
		Kimchi kimchi = new Kimchi();
		Ramen ramen = new Ramen();
		
		human.eat(kimchi);
		human.eat(ramen);
		human.eat(new Apple());
	}
}


//다형성 이용시 - 앱에 확장성이 생긴다.
