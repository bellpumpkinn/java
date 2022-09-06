package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; //이 줄이 실행될때를 promotion
		i = (int)b;
		System.out.println(i);
		
		int i2 = 300;
		byte b2 = (byte)i2; //casting
		System.out.println(b2); //오버플로우됨, 버그의 원인은 오버플로우
	}
}
