package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a"; //string이 상수로 만들어짐
		b = s == "a"; //true
		
		s = new String("a"); //이거에 대한 이해는 5장을 배우면 이해가 된다.
		b = s == "a";  //false
		
		b = s.equals("a"); //equals 메서드 - s에 담긴값이랑 ()안에 담긴값이 같은지 확인해준다.
		//s가 주어 equals 서술어 "a"는 목적어
		System.out.println(b);
	}
}
