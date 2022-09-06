package ch07.ex06.case04;

public class Main {
	public static void main(String[] args) {
		Bowl<Integer> bowl1 = new Bowl<>();
		Bowl<String> bowl2 = new Bowl<>();
		
		bowl1.setVal(1);
		bowl2.setVal("Hello");
		
		int i = bowl1.getVal();
		String s = bowl2.getVal();
	}
}

//제네릭타입을 메서드에 선언하면 제네릭메서드
//제네릭타입을 클래스에 선언하면 제네릭클래스