package ch05.ex09.case1;

public class Main {
	public static void main(String[] args) {
		new Init();
		new Init(); 
		
		new Init(1);
	}
}
//인스턴스블록이 먼저실행되고 생성자가 실행이된다.
//인스턴스블록은 어떤뉴를 하듯 실행이 된다.
//하지만 생성자는 콜을 당해야지 생성이 되고 안당하면 생성이 안된다.