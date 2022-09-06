package ch05.ex03.case1;

public class Tv {
	private String color; //String의 초기값 = null
	private boolean power; //boolean의 초기값 = false
	private int channel;
	
	public String getColor() {
		return color;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public boolean isPower() { //메서드도 리턴타입이 불리언이면 is로 시작한다.
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
