package ch03.ex03;
//비트전환연산자
public class Bitwise {
	public static void main(String[] args) {
		int x = 10; //10
		System.out.printf("%s, %d\n", "0000000000000000000000000000" +Integer.toBinaryString(x),x);
		
		x = ~x; //-11
		System.out.printf("%s, %d\n", Integer.toBinaryString(x),x);		
		
		x = x + 1; //-10
		System.out.printf("%s, %d\n", Integer.toBinaryString(x),x);		
		
		int y = 1;
		System.out.printf("%s, %d\n", "0000000000000000000000000000" +Integer.toBinaryString(y),y);
		
		y = ~y + 1;
		System.out.printf("%s, %d\n", Integer.toBinaryString(y),y);
	}
}
//비트전환연산자 + 1 해줘야지 부호가 바뀐 숫자가 됨.
//ex) 10 -> -10
