package ch05.home.ex05.case6;

public class Phone {
	private String makerName; //maker�� ��ü, makerName�� �Ӽ�
	private int price;
	
	public void sendMsg() {}
	public void call() {}
	public void playGame() {} //�޼����̸��� ���縦 ����Ѵ�.
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}
}
//���Ѽ� has a ���̱� ������ ���� ���� �������Ѵ�.
