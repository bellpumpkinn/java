package ch05.ex01.case2;

public class Main {
	public static void main(String[] args) {
		String name = "���Ѽ�";
		int age = 35;
		//�ѻ���� �����ߴµ� �ڵ尡 2��.
		System.out.printf("%s�� %d���Դϴ�.\n", name, age);
		
		User user = new User(); //Ŭ������� �������� ���� ����
		user.name = "���Ѽ�";
		user.age = 35;
		System.out.printf("%s�� %d���Դϴ�.", user.name, user.age);
	}
}	
