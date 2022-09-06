package ch08.ex04;

import java.util.logging.Logger;

//이해말고 반복숙달.
public class C01MyLogger {
	public static void main(String[] args) {
		Logger.getGlobal().info("hello"); //getGlobal() 호출했더니 객체가 생김-> 팩토리 메소드
	}
}

