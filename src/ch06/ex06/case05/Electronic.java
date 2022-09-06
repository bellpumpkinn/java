package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200; //�ڵ�� = �ڵ尪
	static final String MAKER_NAME = "LG"; //�տ� public �Ƚᵵ �ڵ����� �ִ°���.
	final int WEIGHT = 10; //public static�Ƚᵵ ������ �ִ°���. �����Ϸ��� �ڵ����� ����.
	LocalDate PRODUCED_DATE = LocalDate.now(); //�Ƚᵵ �����Ϸ��� �ڵ����� �߰���Ŵ.
	
	public abstract void displayMsg();
	abstract int getTemperature(); //�տ� public �ڵ����� �����Ϸ��� �߰���Ŵ
	String getModelName();
}
/*
�������̽�
��� �ʵ尡 public static final�� �����ȴ�. �Ƚᵵ �����Ϸ��� �ڵ����� �ٿ���.
��� �޼��尡 public abstract�� �����ȴ�. �Ƚᵵ �����Ϸ��� �ڵ����� �ٿ���.
��ü������ ��ü�� ������ �� ����.(�߻����̱� ����)
�� ������ �Ҽ������ϱ� �����ڰ� ����.
�׷��� �ٷ� �ʱⰪ�� ����Ѵ�.

Ȱ�뿹�δ� ������������ ���鶧 ������ 1, ������ 2 �̷��Ÿ� �������̽��� �־��Ѵ�.
*/


//�߻�޼���,����Ʈ�޼���,����ƽ�޼��常 ������.