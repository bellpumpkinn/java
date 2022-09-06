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
���濡 ���ʰ� ���찳�� ��´�.
���濡�� ������ ������.
���� ������ �����̸� write, ���찳�� �����.
*/


/* �����Ѱ�.
public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Eraser eraser = new Eraser();
		List<Stationary> bag = new ArrayList<>(); //�п�ǰ�� ���� ������ ������ ����.
		
		bag.add(pencil);
		bag.add(eraser);
		
		for(Stationary stationary: bag) {
			if(stationary instanceof Pencil) ((Pencil)stationary).write();
			if(stationary instanceof Eraser) ((Eraser)stationary).erase();
		}
	}

*/