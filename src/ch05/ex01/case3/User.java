package ch05.ex01.case3;
//encapsulation(ĸ��ȭ) - ���߰��������
public class User {
	private String name; //private�� ����ٴ¸��� ���ԵǴ°�
	private int age;
	
	// void : �޼��尡 ����ǰ� ���� ���ϵǴ°��� ���ٴ� �ǹ� / �޼����̸��� ����� ��Ÿ����.
	public void setName(String name) {
		this.name = name; //this�� ������ ��������� �����Ҽ������ϱ� ����.
	}
	
	//�̷� �޼��带 setter��� �θ���.
	public void setAge(int age) {
		this.age = age;
	}
	
	//�̷� �޼��带 getter��� �θ���.
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

//setName�� �ִ� name������ �޼����Ͼȿ��� ����Ȱɷ� �ν�(���ÿ� ����)
//������ name�� heap�� ����.
//this.name�� ���������°� �˷��ַ��� this�� ����
//this�� ������ �����ϸ��
//this.name�� ������� name�̶�� �θ����.
/*
	void setName(String name) // �޼��� ����� { //
		
	}
	void setAge(int age) {
		this.age //������� age = age;//�Ķ���� age
	}
�޼���� ���ϰ��� �ִ°Ű� ���°�
void = ���ϰ��� ���°�
���ϰ��� �ִ� = ���ϰ��� Ÿ��
*/