package ch06.ex06.case09;

public class Browser implements UI{
	@Override
	public void out() {
		System.out.println("HTML�� ����ϴ�.");
	}
	
	public static void play() {
		System.out.println("������ ����ϴ�.");
	}
}


//ũ�� is a ������
//������ is a UI
//���� ũ�� is a UI