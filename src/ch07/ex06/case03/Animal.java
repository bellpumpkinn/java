package ch07.ex06.case03;
//Factory�޼���
public interface Animal {
	default void eat() {
		System.out.println("�Դ�.");
	}
	
	void move();
}

//default�޼��带 ���� �ٵ� �������� �ִ�.
//�׸��� default�޼���� �������̵带 ���ص� �ȴ�.