package ch05.ex02.case1;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setA(1); //������ A���� 1�� �־����
		box.setB(2); //������ B���� 2�� �־���� 
		
		int result = box.getA() + box.getB();
		result = box.getA() - box.getB();
		
		System.out.println(result);
	}
}

// box.getA() -> ���ڿ��� A���� ��������
// box.getB() -> ���ڿ��� B���� ��������
// box�� �������̶�� �Ѵ�.
// �������� �����͸� ��´� ��� �������� ����