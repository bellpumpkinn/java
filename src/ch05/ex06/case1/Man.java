package ch05.ex06.case1;

public class Man {
	public static void say(String msg) {
		System.out.println(msg);
	} //say는 누가하든지 관심없고 말만하면된다.
	
	public void tell(String msg) {
		System.out.println(msg);
	} //tell은 객체부터 만든다음에 콜하면 된다.
}
