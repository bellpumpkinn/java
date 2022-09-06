package ch05.ex03.case1;

public class Main {
	public static void main(String[] args) {
		Tv myTv = new Tv(); // Tv를 한대 샀어요 라는 뜻.
		
		System.out.println(myTv);
		
		System.out.printf("%s, %b, %d\n", 
				myTv.getColor(), myTv.isPower(), myTv.getChannel());
		//객체가 생성됐을때 null, false, 0이 들어갔음
		
		myTv.setColor("red");
		myTv.setPower(true);
		myTv.setChannel(7);  //이 Tv는 빨간색,전원이 켜져있고, 7번을 틀어놓은 Tv
	
		System.out.printf("%s, %b, %d\n", 
				myTv.getColor(), myTv.isPower(), myTv.getChannel());
	}
}
