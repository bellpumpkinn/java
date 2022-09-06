package ch08.ex03.case01;

public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		try{
			int result = arr[10];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생했습니다.");
		}
		
		System.out.println("끝.");
	}
}

/*

try{
	예외가 발생할수있는 코드부분
} catch(처리할 예외 타입 e){
	try블록안에서 예외가 발생했을때 예외를 처리하는 부분.
}


*/
