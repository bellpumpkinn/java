package ch06.ex06.case10.익명클래스;
//익명클래스
public class Main {
	public static void main(String[] args) {
		BusCard card = new BusCard() { 
			@Override
			public void tagOn() {
				System.out.println("tag On.");
			}

			@Override
			public void tagOff() {
				System.out.println("tag Off.");
			}
		};
		
		card.tagOn();
		card.tagOff();
	}
}

/*
인터페이스로는 객체생성이 원래 불가능.
이 클래스는 이름이 없는 클래스라서 객체를 1번만 만들수있다.
*/