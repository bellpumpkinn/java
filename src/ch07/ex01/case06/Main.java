package ch07.ex01.case06;

public class Main {
	public static void main(String[] args) {
		Human human = new Student();
		human.sleep();
		
		Student student = (Student)human;
		student.study();
		student.sleep();
	}
}

/*
��üŬ������ �����ϴ� �޼���� �����ְ� ���°Ŵ� ������.
extends�� ���󰡼� Ȯ���Ѵ�.
��ü�� �ڽ�Ÿ������ �θ� �� �����־ ���ϴ�.
Ư���� ��쿡�� �θ�Ÿ������ �ٲ۴�.
Ÿ�Կ� �ɸ´� �ൿ�� �Ϸ��� Ÿ���� �ٲ۴�(���θ��, ĳ����).
*/