package ch07.ex04.case01;

public class Score {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		int[] scores = {100, 37, 75, 90, 100};
		
		for(int score: scores) sum += score;
		
		//avg = 1.0 * sum / 4; 다르게 하려면 밑에처럼 쓰면됨
		avg = 1.0 * sum / scores.length; //유지보수에 훨씬 유리하다.
		
		System.out.printf("%d %.1f\n", sum, avg);
		System.out.println(scores.length); //scores.length는 중괄호안에 있는 데이터 개수.
	}
}


//11줄이 하드코딩, 12줄이 소프트코딩