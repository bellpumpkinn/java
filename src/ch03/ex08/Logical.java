package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true; //true
		b = (2 > 1) && (2 > 1); //비교와 논리가 있으면 비교연산자를 먼저 실행. true
		b = (2 < 1) && (2 > 1); //하나라도 false가 있으면 false
		b = (2 < 1) || (2 > 1); //하나만 true면 true
		b = (2 < 1) || (2 < 1); //false
		System.out.println(b);
		
		int x = 0; //&&빠른앤드
		int y = 0;
		b = ++x < 0 && ++y <0; //false ,&&은 true,true에서 true고 나머지는 다 false.
		//첫 ++x < 0 이 false면 어차피 false니까 y = 0 을 그대로 유지.
		System.out.printf("x: %d, y: %d, b: %b", x, y, b); //boolean은 %b를 씀.
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y <0; //그냥 &에선 y=1이 나옴
		System.out.printf("\nx: %d, y: %d, b: %b", x, y, b);
		
		x = 0; //||빠른 or는 처음이 false면 뒤도 계산한다.
		y = 0;
		b = ++x < 0 || ++y < 0;
		System.out.printf("\nx: %d, y: %d, b: %b", x, y, b);
		
		x = 0; //||빠른 or 는 처음에 true가 나오면 결과값이 true 뒷부분은 계산안한다. 
		y = 0; // 뒷부분 계산안하니까 작업시간이 빨라서 빠른or라고 한다.
		b = ++x > 0 || ++y < 0;
		
		System.out.printf("\nx: %d, y: %d, b: %b", x, y, b);
		//&&(빠른앤드),||(빠른or) 쓰면 된다.
		//빠르다는것은 request보내서 response가 빠르다는것을 말함.
	}
}    
