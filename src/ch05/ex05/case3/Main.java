package ch05.ex05.case3;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2);
		System.out.println(result);
		
		Paper paper = new Paper(); //���̸� 1�� �����ߴ�.
		paper.setA(1);
		paper.setB(2);
		// Paper paper2 = calculator.add(paper); -> ���̸� 2���ߴٰ� ���� �Ҽ��ִ�.
		paper = calculator.add(paper); //������ �ּҰ��� �����ؼ� add(Paper paper)�� paper�� �Ѿ��.
		System.out.println(paper.getResult());
	}
}
//Ŭ����Ÿ���� �������� ��ü�� �ּҰ��� ��.