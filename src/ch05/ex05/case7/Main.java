package ch05.ex05.case7;

public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		retailer.sell(farmer.sell(1000));
		//��ΰ� ����� �ϳ� ��Ȯ, õ������ǥ���̰�, ������ڳѱ��, ������ڴ� 2000�����̰� �ȾҴ�.
	}
}
//���� ����
//�ĸӿ� �������� ���, ����� ��ǰ
//����� �ĸӰ� ����