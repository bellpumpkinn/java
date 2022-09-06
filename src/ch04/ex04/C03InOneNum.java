package ch04.ex04;

import java.util.Scanner;

public class C03InOneNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		
		do {
			System.out.print("입력: ");
			input = scan.nextInt();
			
		} while(!(1 <= input && input <= 9)); //1~9사이가 아닌 수를 입력하면 반복문을 빠져나간다.
		
		System.out.println("끝.");
	}
}