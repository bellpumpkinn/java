package ch04.ex01;
//if else
public class C02If {
	public static void main(String[] args) {
		int visitCnt = 0;
		
		if(visitCnt < 1) {
			System.out.println("첫방문입니다.");
			visitCnt++;
		} else {
			System.out.println("재방문입니다.");
		}
		//둘중 하나만 실행되서 exclusive(배타적)이다.
		//visitCnt가 1이 된상태. -> 재방문입니다. 가 나와야함
		if(visitCnt < 1) System.out.println("첫방문입니다.");
		else System.out.println("재방문입니다.");		
	}
}
