package ch05.ex08.case4;

public class Deposit {
	private int balance;
	
	public Deposit() {
		//this.balance = 1000;
		this(1000); //중복코드를 제거한거
	}
	
	public Deposit(int principal) { //원금
		//this.balance = principal;
		this(principal, 0); //위에랑 똑같음. 중복코드를 제거한거.
	}
	
	public Deposit(int principal, int interest) { //원금이랑 이자
		//this.balance = principal + interest;
		this.balance = principal + interest + 100;
		//위에 처럼 +100하면 전부다 + 100된 값이 나옴.
	}
	
	public int getBalance() {
		return this.balance;
		//return balance; 이것도 가능.
	}
}
