package ch06.ex06.case10.�͸�Ŭ����;
//�͸�Ŭ����
public class Main {
	public static void main(String[] args) {
		BusCard card = new BusCard() { 
			@Override
			public void tagOn() {
				System.out.println("tag On.");
			}

			@Override
			public void tagOff() {
				System.out.println("tag Off.");
			}
		};
		
		card.tagOn();
		card.tagOff();
	}
}

/*
�������̽��δ� ��ü������ ���� �Ұ���.
�� Ŭ������ �̸��� ���� Ŭ������ ��ü�� 1���� ������ִ�.
*/