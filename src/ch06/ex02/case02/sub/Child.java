package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Child extends Parent {
	public void play() {
		// this.getRegNum();
		this.getName();
		this.getMoney(); //protected는 자식이라서 접근이 된다.
		// this.addMoney(1000);
	}
}
