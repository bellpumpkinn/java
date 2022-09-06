package ch07.ex05.case04;

import java.util.ArrayList;
import java.util.List;

public class ScoreList {
	public static void main(String[] args) {
		List<Integer> score1 = new ArrayList<>(); // 국어 점수를 집어넣을 공간을 마련.
		List<Integer> score2 = new ArrayList<>();// 수학 점수를 집어넣을 공간을 마련.
		List<List<Integer>> scores = new ArrayList<>(); // 국어점수배열과 수학점수배열을 배열해놓을 공간을 마련
		
		for(int i = 0; i < 3; i++) {
			score1.add(80 + i);
			score2.add(90 + i);
		}
		System.out.printf("%s\n%s\n", score1, score2);
		
		scores.add(score1); //scores에 첫번째 레코드를 집어넣음
		scores.add(score2);
		System.out.println(scores);
	}
}

/*
 * List를 쓰는 이유는 몇과목인지 갯수를 안정해도 되기때문에 쓴다.
 * */
