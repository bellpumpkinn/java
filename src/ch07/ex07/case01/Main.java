package ch07.ex07.case01;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("hello"); //()부터가 say메서드고 human에 들어감.
		human.say();
	}
}
