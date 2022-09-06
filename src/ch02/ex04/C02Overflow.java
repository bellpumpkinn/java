package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128; 컴파일에러뜸
		byte b = 127;
		//b = b + 1; 컴퓨터가 인지를 못함
		
		b++; //쁠쁠연산자 : 데이터를 읽고 1을 증가시킨다.
		b++;
		System.out.println(b);
	}
}	
