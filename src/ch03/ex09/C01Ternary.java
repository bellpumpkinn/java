package ch03.ex09;

public class C01Ternary {
	public static void main(String[] args) {
		int x = 1;
		int y = -1;
		
		//���׿�����(�߾Ⱦ��� if����)
		
		int absX = (x >= 0) ? x : -x; //x�� 0�̻��̸�(true) x�� ���´�. false�̸� ���� -x�� ���´�.
		int absY = (y >= 0) ? y : -y; //���ǰ� ? ù��°���ϰ� : 2��°���ϰ�
		
		System.out.printf("absX: %d, absY: %d", absX, absY);
	}
}
