package ch05.ex05.case3;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	//    ����Ÿ��  ���������� Ÿ��
	public Paper add(Paper paper) {
		paper.setResult(paper.getA() + paper.getB());
		return paper; //paper�� �ּҰ��� ���ϵǼ� paper=calcul�� ���� paper�� �Ѿ
	}
}

//int, double�� ������Ÿ���� �ƴ϶� ��ü,Ŭ������ ������Ÿ���̴�.
//��ü�� ������Ÿ���̴�. Ŭ������ ������Ÿ���̴�.
//����Ÿ��, ����������Ÿ��