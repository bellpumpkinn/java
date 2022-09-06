package ch06.ex06.case09;

public class Browser implements UI{
	@Override
	public void out() {
		System.out.println("HTML로 출력하다.");
	}
	
	public static void play() {
		System.out.println("음악을 재생하다.");
	}
}


//크롬 is a 브라우저
//브라우저 is a UI
//따라서 크롬 is a UI