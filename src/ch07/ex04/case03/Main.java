package ch07.ex04.case03;

public class Main {
	public static void main(String[] args) {
		Cat[] cats = new Cat[3];  //고양이3마리가 들어갈수있는 고양이집 3개 만들어졌다.
		
		cats[0] = new Cat("헤롱이");
		cats[1] = new Cat("야코미");
		cats[2] = new Cat("새코미");
		
		//cats[2] = new Dog();
		
		for(Cat cat: cats) System.out.println(cat);
		//for each는 iterating알고리즘에서 쓴다.
	}
}
