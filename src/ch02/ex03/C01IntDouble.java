package ch02.ex03; //형변환

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i; // 캐스팅이자 promotion 
		System.out.printf("%f, %d\n", d, i);
		
		d = (double)i; //괄호가 캐스팅 연산자.
		//할당연산자가 복사하는값은 캐스팅연산자가 리턴하는값을 복사
		//1을 double로 1.0000나오면 이 값을 할당연산자가 복사.
		System.out.printf("%f, %d\n", d, i);

		//i = d; 오류.해결책은 17줄
		i = (int)d;
		System.out.printf("%f, %d\n", d, i);
	}
}
