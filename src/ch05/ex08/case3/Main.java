package ch05.ex08.case3;

public class Main {
	public static void main(String[] args) {
		Citrus citrus = new Citrus(); //�⺻�����ڸ� ���ϸ鼭 ��ü�� ����.
		//���� �ϳ� ����.
		System.out.println(citrus.getName()); 
		
		//citrus = new Citrus("������"); //�������� �ϳ� ����.
		
		
		Citrus citrus1 = new Citrus(); //citrusŬ������ ���������� �����س��� ���� �⺻���� �������� ����.
		System.out.println(citrus1.getName());
		
		Citrus citrus2 = new Citrus("õ����");
		System.out.println(citrus2.getName());
	}
}
//citrus�� �߿��� ������.