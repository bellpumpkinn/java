package ch06.ex03.case01;
//오버라이딩 개념.
public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.shout();
		dog.shout();
	}
}
//부모로 부터 메소드를 받았는데 선언문은 마음에 다는데 알고리즘이 마음에 안듬
//그래서 몸체(알고리즘)만 덮어 쓴것을 오버라이딩.