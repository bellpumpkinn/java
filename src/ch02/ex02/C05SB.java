package ch02.ex02;

public class C05SB {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("우리 개는 "); //메모리절약함
		
		int len = src.length();
		System.out.println("length: " + len);
		
		src.append("짖는다."); //스트링버퍼에서 붙이는 역할
		src.replace(3, 4, "고양이");
		
		String str = src.toString();
		
		System.out.println(src); //스트링버퍼타입
		System.out.println(str); //스트링타입    
	}
}
