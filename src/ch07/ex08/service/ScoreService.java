package ch07.ex08.service;

import java.util.List;

import ch07.ex08.domain.Score;

public interface ScoreService {
	void addScore(Score score);  //점수로 본다.업무관점으로
	List<Score> getScores();
	
}
