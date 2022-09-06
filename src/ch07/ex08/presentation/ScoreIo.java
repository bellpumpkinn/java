package ch07.ex08.presentation;

import java.util.List;

import ch07.ex08.domain.Score;
import ch07.ex08.service.ScoreService;

public class ScoreIo {  //점수업무에 종속된걸 ScoreIo에 넣어둔다.
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() {
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;  //for블럭안이면 3번 선언하게됨.
		
		for(int i = 0; i < 3; i++) {
			korScore = Console.inNum("국어 점수를 입력하세요.");
			engScore = Console.inNum("영어 점수를 입력하세요.");
			mathScore = Console.inNum("수학 점수를 입력하세요.");
			//user는 점수데이터를 만들고, 나는 점수를 모아서 score데이터를 만듬.
			Score score = new Score(korScore, engScore, mathScore);
			scoreService.addScore(score); //유저가 입력한 데이터를 객체로 변환해서 스코어서비스한테 넘겨준다.
		}
		
		List<Score> scores = scoreService.getScores(); //점수표를 읽어들인다.
		for(Score score: scores)
			System.out.println(score);
	}
}
