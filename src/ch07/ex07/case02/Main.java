package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say");
		human.say();
		Human.walk(); 
		//human.walk(); //say가 있지 walk가 있는게 아니라서 못씀.
		human.sleep(); 
		
		human = new Student();
		human.say(); //오버라이드문법에 의해 자식의 메서드가 나온다.
		//human.walk(); static은 상속이 안되니까.
		human.sleep();
	}
}
