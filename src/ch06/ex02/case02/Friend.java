package ch06.ex02.case02;

public class Friend {
	public void play() {
		Parent parent = new Parent(); //친구가 아빠를 봤다.
		
		//parent.getRegNum();   private이라서 못씀.
		parent.getName();   //public 이라서 사용가능.
		parent.getMoney();
		parent.addMoney(1000);
	}
}
