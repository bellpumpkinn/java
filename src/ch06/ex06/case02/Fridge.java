package ch06.ex06.case02;

import ch06.ex06.case01.Appliance;

public class Fridge extends Appliance {
	//Appliance�� ����޼ҵ�� fridge�� ����� �ƴ�.
	@Override
	public void on() {
		System.out.println("����� �Ѵ�.");
	}
}
//Fridge - �����
//�߻�Ŭ������ ��ü�� ������ ���Ѵ�.
//�׷��� �߻�Ŭ���� �ϳ��� �ϴ� ����� ���� ���� ��ü�� ���� Ŭ������ ����.
//�߻�Ŭ������ ��ӹ��� �ڽ� Ŭ������ �ݵ�� �θ��� �߻�޼��带 Overriding�ؾ� �Ѵ�.
//�߻�Ŭ������public void on�� �ڽ�Ŭ������ Fidge�� �״�� ���.