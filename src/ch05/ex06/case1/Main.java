package ch05.ex06.case1;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java.");
		// Man.tell(""); �ν��Ͻ��޼ҵ�� �ٷ� �Ұ���. ��ü�� �������� ��밡��
		
		Man man = new Man();
		man.tell("I love java.");
		man.say("Hello"); //�����ϱ������� ��� �޴´�. �ǵ��� 5°��ó�� ���.
	}
}
//static�޼ҵ�� ��ü������ �ı��ϴ°�.
//�����ϴ���������� �����ϴ����� ���������� static �޼ҵ带 ����.