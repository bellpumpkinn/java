package ch07.ex06.case05;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		Integer[] arr1 = {1, 2, 3};
		String[] arr2 = {"a", "b", "c"};
		
		int i = box.getLastVal(arr1); //T가 인티저로 결정됨. 리턴되는값도 인티저
		String s = box.getLastVal(arr2); //T가 스트링으로 결정됨. 리턴되는값도 스트링
		
		System.out.printf("%d %s", i, s);
	}
}


//제너릭메서드 메서드를 콜할때 타입을 결정.
//마이바티스할때 제너릭메서드 사용함.

/*
 * 지금까지는 무한집합을 만드는 방법
 * 유한집합을 만드는방법은 case06
 */
