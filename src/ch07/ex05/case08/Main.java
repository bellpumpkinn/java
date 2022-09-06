package ch07.ex05.case08;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Dove dove = new Dove();
		Duck duck = new Duck();
		Lion lion = new Lion();
		Leopard leopard = new Leopard();
		
		List<Creeper> pen = new ArrayList<>(); //들짐승을 가두는 울타리.
		pen.add(lion);
		pen.add(leopard);
		//pen.add(dove);  비둘기는 날짐승이라서 넣기불가능.

		List<Bird> cage = new ArrayList<>(); //새장 만듬.
		cage.add(dove);
		cage.add(duck);
		//cage.add(lion); 사자 새장에 넣기 불가능.
		
		for(Creeper creeper: pen) creeper.walk();
		for(Bird bird: cage) bird.fly();
	}
}
