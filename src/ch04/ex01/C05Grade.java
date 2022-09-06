package ch04.ex01;

public class C05Grade {
	public static void main(String[] args) {
		int score = 45;
		char grade = 0;
		
		if(score >= 90) grade = 'A';
		else if(score >= 80) grade = 'B';
		else grade = 'C';
		
		System.out.println(grade);
	}
}
//리팩토링 : 앱의 기능은 유지하고 코드는 개선하는거
//고도화 : 앱의 성능을 개선하는거