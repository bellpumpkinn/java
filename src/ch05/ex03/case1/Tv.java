package ch05.ex03.case1;

public class Tv {
	private String color; //String�� �ʱⰪ = null
	private boolean power; //boolean�� �ʱⰪ = false
	private int channel;
	
	public String getColor() {
		return color;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public boolean isPower() { //�޼��嵵 ����Ÿ���� �Ҹ����̸� is�� �����Ѵ�.
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
}
