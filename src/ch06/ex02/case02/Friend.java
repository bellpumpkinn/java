package ch06.ex02.case02;

public class Friend {
	public void play() {
		Parent parent = new Parent(); //ģ���� �ƺ��� �ô�.
		
		//parent.getRegNum();   private�̶� ����.
		parent.getName();   //public �̶� ��밡��.
		parent.getMoney();
		parent.addMoney(1000);
	}
}
