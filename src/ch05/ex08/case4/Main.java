package ch05.ex08.case4;

public class Main {
	public static void main(String[] args) {
		Deposit deposit = new Deposit(); // 나 예금 하나 개설할래요.
		deposit = new Deposit(2000); //2000만원짜리 예금 하나 더 추가할래요.
		//deposit = new Deposit(2000, 1000); //3000만원
		
		System.out.println(deposit.getBalance());
	}
}
