package ch07.ex06.case05;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		Integer[] arr1 = {1, 2, 3};
		String[] arr2 = {"a", "b", "c"};
		
		int i = box.getLastVal(arr1); //T�� ��Ƽ���� ������. ���ϵǴ°��� ��Ƽ��
		String s = box.getLastVal(arr2); //T�� ��Ʈ������ ������. ���ϵǴ°��� ��Ʈ��
		
		System.out.printf("%d %s", i, s);
	}
}


//���ʸ��޼��� �޼��带 ���Ҷ� Ÿ���� ����.
//���̹�Ƽ���Ҷ� ���ʸ��޼��� �����.

/*
 * ���ݱ����� ���������� ����� ���
 * ���������� ����¹���� case06
 */
