package ch06.ex06.case08;

public class Main {
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Goose goose = new Goose();
		
		elephant.eat();
		goose.eat();
		
		elephant.move();
		goose.move();
	}
}

//����Ʈ�޼ҵ�� ���� �������� ǳ��������.
//����Ʈ�޼ҵ��� ���� - �ڵ��ߺ� �ּ�ȭ

/*
<�������̽��� default �޼���>
-�̹� ������� �������̽��� �޼��带 �߰��� �� ����Ѵ�.
-�޼��� �տ� default Ű���� �߰�
-���������� ����
-��ӹ��� Ŭ������ �������̽��� default �޼��带 �ݵ�� �������̵��� �ʿ�� ����.
-���� �����ڴ� �ڵ������� public �߰��ȴ�.
*/