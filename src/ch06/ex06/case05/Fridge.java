package ch06.ex06.case05;

import ch06.ex06.case03.Appliance;

public class Fridge implements Appliance, Electronic {
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() {return 0;}
	@Override public String getModelName() {return null;}
}

/*
인터페이스는 다중 상속이 가능하다.
참고로 일반클래스는 다중상속이 불가능하다.

인터페이스를 상속받은 자식 클래스는 인터페이스의 모든 필드, 메서드를 누락없이 구현하여야 한다.

그리고 인터페이스를 2개 두면 클래스를 2개둘때와 비교하면 부담이 덜하다. 
인터페이스는 바디가 없고 껍데기만 있기때문(추상적)
인터페이스는 유지보수하지 않고 상속받은 자식을 유지보수하기때문에 부담이 되지 않는다.
*/