package ch05.home.ex05.case6;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone(); //���� �ϳ� �ִ�.
		Person person = new Person();
		
		person.setName("���Ѽ�");
		phone.setMakerName("�Ｚ");
		phone.setPrice(1_000_000);
		//���� �κб����� ���� ����� ���� ����.
		
		person.setPhone(phone);//���⼭ ���� �ϳ��� ���谡 �ȴ�. has a���踦 ����.
		person.sendMsg();
		person.call();
		person.playGame();
	}
}

/*
���Ѽ��� �Ｚ���� 1�鸸�� �ְ� ����ϴ�.
�տ� �� ���� ���� �幵�մϴ�.

�޼����� ���� ���ϴ�.
������ ����, ��ȭ�� �ɾ��, ������ �ȵǳ׿�.
��� �ڿ� �ٽ� ������ ���ƴϴ�.
��ٸ��� ���� ������ ������ �մϴ�.
*/
// A has a B �� �̿��ϴ� ����.