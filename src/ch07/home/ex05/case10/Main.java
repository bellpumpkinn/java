package ch07.home.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Eraser eraser = new Eraser();
		Bag<Stationary> bag = new Bag<>();
		
		bag.add(pencil);
		bag.add(eraser);
		
		for(Stationary stationary: bag) {
			if(stationary instanceof Pencil) ((Pencil)stationary).write();
			if(stationary instanceof Eraser) ((Eraser)stationary).erase();
		}
	}
}


/*
가방에 연필과 지우개를 담는다.
가방에서 물건을 꺼낸다.
꺼낸 물건이 연필이면 write, 지우개면 지운다.
*/


/* 내가한거.
public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Eraser eraser = new Eraser();
		List<Stationary> bag = new ArrayList<>(); //학용품을 넣을 공간인 가방을 마련.
		
		bag.add(pencil);
		bag.add(eraser);
		
		for(Stationary stationary: bag) {
			if(stationary instanceof Pencil) ((Pencil)stationary).write();
			if(stationary instanceof Eraser) ((Eraser)stationary).erase();
		}
	}

*/