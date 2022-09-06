package ch05.ex01.case2;

public class Main {
	public static void main(String[] args) {
		String name = "최한석";
		int age = 35;
		//한사람을 생각했는데 코드가 2줄.
		System.out.printf("%s은 %d살입니다.\n", name, age);
		
		User user = new User(); //클래스명과 변수명을 같게 적음
		user.name = "최한석";
		user.age = 35;
		System.out.printf("%s은 %d살입니다.", user.name, user.age);
	}
}	
