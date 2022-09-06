package ch04.ex04;

import java.util.Scanner;

public class C04GuessNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int target = 0; //app이 생각한 값을 타겟에 저장
		int guess = 0; // 내가 추측한값을 게스에 저장
		int tries = 0; // 몇번만에 했는지 횟수 저장
		String msg = "";
		
		target = (int)(Math.random() * 1000) + 1;
		
		do {
			System.out.print("찍어봐.: ");
			guess = scan.nextInt();
			tries++;
			
			if(guess > target) msg = "Down.";
			else if (guess < target) msg = "Up.";
			else msg = "Great";
			System.out.println(msg);
		} while(guess != target);
		
		System.out.printf("%d번만에 %d를 맞췄습니다.", tries, target);
	}
}
