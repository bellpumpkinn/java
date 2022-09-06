package ch05.ex08.case3;

public class Main {
	public static void main(String[] args) {
		Citrus citrus = new Citrus(); //기본생성자를 콜하면서 객체를 생성.
		//귤을 하나 땄다.
		System.out.println(citrus.getName()); 
		
		//citrus = new Citrus("레드향"); //레드향을 하나 땄다.
		
		
		Citrus citrus1 = new Citrus(); //citrus클래스에 레드향으로 설정해놔서 이제 기본으로 레드향이 나옴.
		System.out.println(citrus1.getName());
		
		Citrus citrus2 = new Citrus("천혜향");
		System.out.println(citrus2.getName());
	}
}
//citrus는 중요한 도메인.