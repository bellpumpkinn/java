package ch07.ex08.service;

import java.util.List;

import ch07.ex08.dao.ScoreDao;
import ch07.ex08.domain.Score;

public class ScoreServiceImpl implements ScoreService{
	private ScoreDao scoreDao; //has a ���� ������
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public void addScore(Score score) {
		scoreDao.intsertScore(score);
	}
	
	@Override
	public List<Score> getScores(){
		List<Score> scores = scoreDao.selsectScores();
		this.calcScore(scores); //�������հ����
		return scores;
	}
	
	private void calcScore(List<Score> scores) {
		scores.forEach(score -> {
			score.setSum(
					score.getKorScore() + 
					score.getEngScore() +
					score.getMathScore());
			score.setAvg(score.getSum() / 3);
		});
	}
}

//����: �޼���� �������̴�. forEach�� ���.
//

