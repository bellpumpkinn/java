package ch08.ex03.case01;

public class C01NoTry {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int result = arr[10];    //exception발생.
		
		System.out.println("끝.");
	}
}

//exception 예외처리