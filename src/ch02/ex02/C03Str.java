package ch02.ex02;

public class C03Str {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum;
		System.out.println(sumStr);
		
		String s = a + b + ""; // int���� ���ڷ� ����.
		System.out.println(s);
		
		s = "" + a + b; //���� 1�� ��������� ���� 2�� �����ϱ� 12�� ���´�.
		System.out.println(s);
		
		String dialog = "Jhon said, \"Hello\""; // Ư������ ���� �������� ���.
		System.out.println(dialog);
	}
}
