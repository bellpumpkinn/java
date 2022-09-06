package ch02.ex01;

public class C01Variable {
	public static void main(String[] args) {
		boolean bl = false; // 변수선언 + 초기값설정
		bl = true;
		byte b = 0; // 변수명은 유일해야 한다.
		short s = 0;
		char c = 0;
		int i = 0;
		long l = 0L;
		float f = 0.0f; //long보다 더 큼 
		double d = 0.0;

		String str = ""; // empty string
		//String str = null; 위와 같음. 
		int a; // 변수를 선언.
		a = 0; //초기화
		// int a;

		// int x;
		// int y; 가독성에서는 아래방법보다 위 방법이 더 좋음
		int x, y;
		int x2 = 0, y2 = 0;
	}
}
