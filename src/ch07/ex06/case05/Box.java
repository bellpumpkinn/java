package ch07.ex06.case05;

public class Box {
	public <T> T getLastVal(T[] arr) {
		return arr[arr.length - 1]; //파라미터의 값을 받고 마지막값을 리턴
	}
}

//제네릭클래스에서 제네릭타입을 사용할수있는범위는 클래스블럭
//제네릭메서드에서 제네릭타입을 사용할수있는범위는 메서드블럭