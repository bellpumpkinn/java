package ch05.ex05.case9;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setName("�Ƹ���");
		
		
		Cat cat2 = cat1.breed();  //cat1�� ���� ��������̸� cat2������ ����.
		//��������̶� ��������̶� ��ü�� �ٸ��ϱ� ���θ������.
		cat2.setName("ưư��");
	}
}
//�޼���ź������ - �ߺ��ڵ��ּ�ȭ
//�޼����ݸ��ϸ� �Ǵϱ�
