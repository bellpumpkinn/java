package ch07.ex06.case04;

public class Main {
	public static void main(String[] args) {
		Bowl<Integer> bowl1 = new Bowl<>();
		Bowl<String> bowl2 = new Bowl<>();
		
		bowl1.setVal(1);
		bowl2.setVal("Hello");
		
		int i = bowl1.getVal();
		String s = bowl2.getVal();
	}
}

//���׸�Ÿ���� �޼��忡 �����ϸ� ���׸��޼���
//���׸�Ÿ���� Ŭ������ �����ϸ� ���׸�Ŭ����