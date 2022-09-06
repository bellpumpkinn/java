package ch05.ex05.case10;
//멤버메서드가 다른멤버메서드를 콜할수있다를 알려주는 케이스
public class Man {
	public void strip() {} //옷벗고나면 튀어나오는거 없다 그래서 void
	public void wash() {} //씻고나면 필요한거 없다 그래서 void
	public void wear(Pajamas pajamas) {	}
	public void lie() {}
	
	public void sleep(Pajamas pajamas) {
		this.strip();
		this.wash();
		this.wear(pajamas);
		this.lie();    //위의 4개를 sleep하나로 끝낸다. -> 반복으로 코드치는거를 줄여줌.
	}
	
}
