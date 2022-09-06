package ch07.ex08.dao;

import java.util.List;

import ch07.ex08.domain.Score;

public class ScoreDaoImpl implements ScoreDao{
	private List<Score> scores;
	
	public ScoreDaoImpl(List<Score> scores) {
		this.scores = scores;
	}
	
	@Override
	public void intsertScore(Score score) {
		scores.add(score);
	}
	
	@Override
	public List<Score> selsectScores(){  //테이블을 만들면 List로 표현.
		return this.scores; //표를 건네줌
	}
}
