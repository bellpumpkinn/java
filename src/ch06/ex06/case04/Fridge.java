package ch06.ex06.case04;

import ch06.ex06.case03.Appliance;

public abstract class Fridge implements Appliance{   //abstract를 쓰면 에러 해결
	void play() {}
}


//상속받은 바디가 없는 메소드를 추상메소드
//메소드가 추상적이다 해서 추상메소드

//implement는 구현하다라는 뜻인데, 상속받은 추상메소드의 바디를 구현하다 해서 implements다.
//부모의 메서드 다 가져오는데 여기에 바디를 구현.
