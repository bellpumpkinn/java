package ch03.ex09;

public class C02Grade {
	public static void main(String[] args) {
		int score = 50; //데이터를 소스에 고정시키는 형태를 'hard coding' 이라고 한다.
		char grade = (score >= 90) ? 'A' : (score >= 80 ? 'B' : 'C'); 
		System.out.println(grade);
	}
}
