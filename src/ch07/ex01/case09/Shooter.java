package ch07.ex01.case09;

public class Shooter {
	private Gun gun;  //������ Ÿ���� �������̽������Ѵ�.
	
	public void fire() {
		this.gun.fire();
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
}


//Shooter has a Gun
//has a ����


/*
���������� ���ؼ�
dependency�� Ÿ���� �������̽��� �д� => Ȯ�强�� Ȯ���ϱ� ���ؼ�
Ȯ�强�� �־���� �پ��� ���� ����Ҽ��ִ�.
*/