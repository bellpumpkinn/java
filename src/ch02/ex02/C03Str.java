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
		
		String s = a + b + ""; // int형을 문자로 만듬.
		System.out.println(s);
		
		s = "" + a + b; //문자 1이 만들어지고 숫자 2가 붙으니까 12가 나온다.
		System.out.println(s);
		
		String dialog = "Jhon said, \"Hello\""; // 특수문자 쓸때 역슬래시 사용.
		System.out.println(dialog);
	}
}
