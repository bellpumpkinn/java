package ch02.ex01;
//오른쪽 값을 복사해서 왼쪽에 넣음
public class C04Assign {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		a = b;
		System.out.printf("%d, %d\n", a, b);
		
		a = b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		
		double d = Math.random();
		System.out.printf("%.2f", d);

	}
}
