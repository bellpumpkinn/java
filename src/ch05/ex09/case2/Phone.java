package ch05.ex09.case2;

public class Phone {
	private static int cnt;
	private int serial;
	
	{
		serial = ++cnt * 100;
	}
	//�ν��Ͻ������ new�Ҷ� ���ٽ����.
	public Phone() {}
	
	public Phone(int serial) {
		this.serial = serial;
	}
	
	public int getSerial() {
		return this.serial;
	}
	
}
