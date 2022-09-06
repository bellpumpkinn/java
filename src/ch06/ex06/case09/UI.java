package ch06.ex06.case09;

public interface UI {
	static void in() {
		System.out.println("키보드로 입력하다.");
	}
	
	void out();
}
/*
인터페이스안의 static 메서드
-객체 생성없이 바로 사용할 수 있다.
*/
/*
static메소드는 선언부에 static키워드가 있어야한다.

UI는 CLI,GUI
둘다 키보드로 입력하니까 in두고
CLI는 글자로 출력, GUI는 그림으로 출력
알고리즘 파악이 되는걸 static메소드를 이용
*/

