package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus();
		
		Tree tree = new Platanus(); //�� �ö�Ÿ�ʽ��� ������ ������ �ϰ� ������ �ѱ׷��ֳ�.
		platanus = (Platanus)tree; //�� �� ������ �ö�Ÿ�ʽ��� ����ϴ»�Ȳ
		
		tree = platanus;
		tree = (Tree)platanus;
	}
}	
