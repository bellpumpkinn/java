package ch05.home.ex01.case1;

public class Main {
	public static void main(String[] args) {
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		
		flower1.name = "â����"; //â����, 7cm, 2cm�� ������ �Ѵ�.
		flower1.petalLength = 7; //�� 3�� �����Ͱ� ��ü ������ �Ѵ�.
		flower1.cupLength = 2; //��ü�� ������ -> ������� �����ϴ°�.
		
		flower2.name = "�ڽ���";
		flower2.petalLength = 4;
		flower2.cupLength = 1;
	}
}

/*
â������ ���� ���̰� 7cm, �ɹ�ħ ���̰� 2cm�Դϴ�.
�ڽ��𽺴� ���� ���̰� 4cm, �ɹ�ħ ���̰� 1cm�Դϴ�.
*/

//��������ȿ��� ��ü�� Ư¡�� �ִ´�.