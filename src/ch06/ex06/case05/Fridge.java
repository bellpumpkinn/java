package ch06.ex06.case05;

import ch06.ex06.case03.Appliance;

public class Fridge implements Appliance, Electronic {
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() {return 0;}
	@Override public String getModelName() {return null;}
}

/*
�������̽��� ���� ����� �����ϴ�.
����� �Ϲ�Ŭ������ ���߻���� �Ұ����ϴ�.

�������̽��� ��ӹ��� �ڽ� Ŭ������ �������̽��� ��� �ʵ�, �޼��带 �������� �����Ͽ��� �Ѵ�.

�׸��� �������̽��� 2�� �θ� Ŭ������ 2���Ѷ��� ���ϸ� �δ��� ���ϴ�. 
�������̽��� �ٵ� ���� �����⸸ �ֱ⶧��(�߻���)
�������̽��� ������������ �ʰ� ��ӹ��� �ڽ��� ���������ϱ⶧���� �δ��� ���� �ʴ´�.
*/