package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200; //코드명 = 코드값
	static final String MAKER_NAME = "LG"; //앞에 public 안써도 자동으로 있는거임.
	final int WEIGHT = 10; //public static안써도 무조건 있는거임. 컴파일러가 자동으로 생성.
	LocalDate PRODUCED_DATE = LocalDate.now(); //안써도 컴파일러가 자동으로 추가시킴.
	
	public abstract void displayMsg();
	abstract int getTemperature(); //앞에 public 자동으로 컴파일러가 추가시킴
	String getModelName();
}
/*
인터페이스
모든 필드가 public static final로 지정된다. 안써도 컴파일러가 자동으로 붙여줌.
모든 메서드가 public abstract로 지정된다. 안써도 컴파일러가 자동으로 붙여줌.
자체적으로 객체를 생성할 수 없다.(추상적이기 때문)
즉 생성을 할수없으니까 생성자가 없다.
그래서 바로 초기값을 줘야한다.

활용예로는 가위바위보를 만들때 가위는 1, 바위는 2 이런거를 인터페이스에 둬야한다.
*/


//추상메서드,디폴트메서드,스태틱메서드만 가진다.