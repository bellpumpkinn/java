package ch05.home.ex05.case6;

public class Person {
	private Phone phone;
	private String name;
	
	public void sendMsg() {
		phone.sendMsg(); //dependency�� phone�� �̿��ؼ� �޼����� ������.
	}
	
	public void call() {
		phone.call(); //dependency�� phone�� �̿��ؼ� ��ȭ�� �Ѵ�.
	}
	
	public void playGame() {
		phone.playGame();
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public void setName(String name) {
		this.name = name;
	}
}
//��ȯ���� ���°�� ����Ÿ�� ��� void�� ����Ѵ�.
//dependency�� �̿��ϴ� ������ ������ ���ѱ�����ؼ� ���� �ϱ� �Ⱦ �̿�����