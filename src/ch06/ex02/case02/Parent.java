package ch06.ex02.case02;

public class Parent {
	private String regNum;
	private String name;
	private int money;
	
	private String getRegNum() {
		return regNum;
	}
	
	public String getName() {
		return name;
	}
	
	protected int getMoney() { //자식만 보여주고싶을때(상속을 전제로 할때는 protected뿐임)
		return money;
	}
	
	void addMoney(int money) {
		this.money += money;
	}
}
