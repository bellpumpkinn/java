package ch05.ex05.case6;

public class Main {
	public static void main(String[] args) {
		Gun gun = new Gun(); //���� ���ڷ� �غ��Ѵ�.
		Shooter shooter = new Shooter();//shooter�� �Ѹ� �غ��Ѵ�.
		
		shooter.setGun(gun); //�����̰� ���� ����.
		shooter.fire();//���Ͱ� �������. 
	}
}
