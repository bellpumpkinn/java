package ch03.ex02;
//�� ����������
public class C02Not {
	public static void main(String[] args) {
		boolean power = false; // ������ �����ִٸ� ǥ��.
		power = !power; // flag���� - ������Ÿ���� boolean. true �ƴϸ� false 2���̱⶧����
		System.out.println(power);
		
		power = !power; // toggle - ���ڴپȾ��ڴ� �Դٰ����ϴ°�.
		System.out.println(power);
	}
}
