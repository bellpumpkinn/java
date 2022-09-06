package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		// byte c = a + b;  에러가뜸.  바이트끼리의 합을 하는과정에서 데이터타입이 int로 바꼈음.
		// int + int = int 형이 됨.
		//int보다 크기가 작은 타입은 int로 변환한다.
		//(byte, char, short -> int)
		byte c = (byte)(a+b); //더한값은 int값이니까 byte로 캐스팅함.
		//int 자주쓰는이유는 byte가 어차피 int로 바뀌니까 그냥 int를 쓴다.
		/*
		 * 이항연산자는 연산을 수행하기전에 피연산자의 타입을 일치시킨다. 그래야 계산가능.
		  int보다 크기가 작은 타입은 int로 변환한다.
		  (byte, char, short -> int)
		  
		  피연산자 중 표현범위가 큰 타입으로 형변환한다.
		  byte+short -> int + int -> int
		 */
		System.out.println(c);
		
		//c = c + 1; 수식(Expression)은 에러가남
		c++;
		System.out.println(c);
		//나누기할때 둘다 int니까 int가 결과값. 
		double d = a / b; //버그원인 : 오버플로우때문에 (double)안붙이면 1.0나옴, 형변환
		System.out.println(d);
		
		/*
		 * [과제]
		 * 위의 버그를 해결해라.
		 */
		
		d = (double) a / b; //a가 더블로 캐스팅이 되고 b로 나눌때 double이라서 더블로 나옴.
		System.out.println(d);
		
		d = 1.0 * a / b; 	 // 1.0 * a 먼저 하면 더블형이 되고, b로 나누면 자동으로 더블이 된다.
		System.out.println(d);	
		
		//나쁜사례
		
		d = (double)(a / b);  //괄호때문에 나누기가 먼저 실행되서 int타입으로 얻어진다. 뒤늦게 double해봤자 1.0
		System.out.println(d);
		
		d = a / b * 1.0; // a / b 즉 int / int 부터 계산되서 1.0이 나옴
		System.out.println(d);
	}
}
