package ch05.ex03.case2;

public class Main {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		System.out.printf("%s\n%s\n\n", tv1, tv2); //�ּҰ��� �ٸ��� Ȯ��.
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
		
		tv1.setColor("red");
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
		
		tv2 = tv1; //tv1�� �ּҸ� tv2�� ������.
		//�̶� tv2�� �ּҴ� garbage�� �ǰ� garbage collector�� ���ֹ�����.
		System.out.printf("%s\n%s\n\n", tv1, tv2); //�����߱⶧���� �ּҰ� ����.
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
	
	}
}
