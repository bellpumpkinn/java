package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Friend {
	public void play() {
		Parent parent = new Parent();
		
		//parent.getRegNum();
		parent.getName();
		//parent.getMoney();   protected는 다른패키지에서 접근을 못한다.
		//parent.addMoney(1000);  default도 다른패키지에서 접근을 못한다.
	}
}
