package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("good");
		
		//과제] b값이, 'a'초과 'c'미만 범위에 속하면, good을 말하라.
		char b = 'b';
		if('a' < b && b < 'c') 
			System.out.println("good");
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0) //앞에 x가 true인데 빠른 or라서 뒷부분은 실행안한다. 따라서 y는 초기값 0을 가짐. 
			System.out.printf("x: %d, y: %d\n", x, y);
		
		//과제] s값이 he, HE, He, hE 중의 하나면, he를 말하라.
		String s = "he";
		
		if(s.equals("he") || s.equals("HE") || s.equals("He") || s.equals("hE"))
			System.out.println("he");
		
		s = ""; //
		if(s.equals("")) System.out.println("값이 없다.");
		 
		//과제] 값이 있으면, 값이 있다. 를 말하라.
		s = "Hello";
		if(!s.equals("")) System.out.println("값이 있다.");
		
		boolean power = false;
		if(!power) System.out.println("전원을 켜다.");
	}
}
