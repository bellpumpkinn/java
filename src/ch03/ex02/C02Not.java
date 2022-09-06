package ch03.ex02;
//논리 부정연산자
public class C02Not {
	public static void main(String[] args) {
		boolean power = false; // 전원이 꺼져있다를 표시.
		power = !power; // flag변수 - 데이터타입이 boolean. true 아니면 false 2개이기때문에
		System.out.println(power);
		
		power = !power; // toggle - 쓰겠다안쓰겠다 왔다갔다하는거.
		System.out.println(power);
	}
}
