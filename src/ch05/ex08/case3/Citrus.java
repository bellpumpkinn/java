package ch05.ex08.case3;
//case1,2�� this������ ��ü�� �˷��ִ°�
//case3�� this������ ȣ���� �˷��ִ°�
public class Citrus {
	private String name;
	
	public Citrus() {
		//this.name = "������"; �� �����ڵ������� 1.���� �ߺ��ȴ�, 2.�ϵ��ڵ�
		//this.Citrus("������"); //new�� ��� ��������
		//new Citrus("������"); //new�ϸ� ��ü�� �����̵�.
		this("������"); //�긦 ����� null�� �ƴ� �������̶��.
		//�̷��� ���� ������ �ڵ��ߺ��� �ּ�ȭ�ϱ����� ����.
	}
	
	public Citrus (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
