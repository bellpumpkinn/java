package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say");
		human.say();
		Human.walk(); 
		//human.walk(); //say�� ���� walk�� �ִ°� �ƴ϶� ����.
		human.sleep(); 
		
		human = new Student();
		human.say(); //�������̵幮���� ���� �ڽ��� �޼��尡 ���´�.
		//human.walk(); static�� ����� �ȵǴϱ�.
		human.sleep();
	}
}
