package ch07.ex06.case02;

public class Alien extends Life{
	//@Override �ȵ�.
	public static void eat() {
		System.out.println("Alien �Դ�.");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien �Ҹ�ġ��.");
	}
}


//static�޼���� �������̵� �ȵ�. ����� �ȵȴ�.
//static�޼���� ��ӵǴ°� �ƴϴ�.
//�ν��Ͻ��������, �޼���� ����� �ȴ�.