package ch05.ex01.case4;

public class User {
	private String name; //������� �ʱⰪ���ִ�����: �����Ⱚ�� �ȵ���
	
	public void setName(String name) {
		char familyName = name.charAt(0);
		
		if(familyName == '��')
			this.name = name;
		else this.name = "��������?";
	}
	
	public String getName() {
		return this.name;
	}
}
//setter�� ���ؼ� �Է�����
//���� �����͸��� ������ �Ϸ��� setter, getter�� ����.