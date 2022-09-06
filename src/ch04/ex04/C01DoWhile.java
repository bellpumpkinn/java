package ch04.ex04;

import java.util.Scanner;

public class C01DoWhile { //C01DoWhile 블럭
	public static void main(String[] args) { //main블럭
		Scanner scan = new Scanner(System.in);
		int a = 0; 
		int b = 0;
		int result = 0;
		
		do {
			System.out.print("a: ");
			a = scan.nextInt();
			
			System.out.print("b: ");
			b = scan.nextInt();
			
			System.out.printf("%d + %d = %d\n\n", a, b, result = a + b);
		} while (result != 0);
		//조건문에서 true가 오면 계속 실행
		//while은 0회이상 반복, do while은 1회이상 반복한다.
		//while이 0회가 되는경우 줄넘기에서 몸무게가 60이하인 경우
	}
}
