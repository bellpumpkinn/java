package ch05.ex08.case4;

public class Deposit {
	private int balance;
	
	public Deposit() {
		//this.balance = 1000;
		this(1000); //�ߺ��ڵ带 �����Ѱ�
	}
	
	public Deposit(int principal) { //����
		//this.balance = principal;
		this(principal, 0); //������ �Ȱ���. �ߺ��ڵ带 �����Ѱ�.
	}
	
	public Deposit(int principal, int interest) { //�����̶� ����
		//this.balance = principal + interest;
		this.balance = principal + interest + 100;
		//���� ó�� +100�ϸ� ���δ� + 100�� ���� ����.
	}
	
	public int getBalance() {
		return this.balance;
		//return balance; �̰͵� ����.
	}
}
