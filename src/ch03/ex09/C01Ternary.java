package ch03.ex09;

public class C01Ternary {
	public static void main(String[] args) {
		int x = 1;
		int y = -1;
		
		//삼항연산자(잘안쓰고 if쓴다)
		
		int absX = (x >= 0) ? x : -x; //x가 0이상이면(true) x가 나온다. false이면 뒤의 -x가 나온다.
		int absY = (y >= 0) ? y : -y; //조건값 ? 첫번째리턴값 : 2번째리턴값
		
		System.out.printf("absX: %d, absY: %d", absX, absY);
	}
}
