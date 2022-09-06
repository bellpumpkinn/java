package ch07.ex08.presentation;

import java.util.List;

import ch07.ex08.domain.Score;
import ch07.ex08.service.ScoreService;

public class ScoreIo {  //���������� ���ӵȰ� ScoreIo�� �־�д�.
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() {
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;  //for�����̸� 3�� �����ϰԵ�.
		
		for(int i = 0; i < 3; i++) {
			korScore = Console.inNum("���� ������ �Է��ϼ���.");
			engScore = Console.inNum("���� ������ �Է��ϼ���.");
			mathScore = Console.inNum("���� ������ �Է��ϼ���.");
			//user�� ���������͸� �����, ���� ������ ��Ƽ� score�����͸� ����.
			Score score = new Score(korScore, engScore, mathScore);
			scoreService.addScore(score); //������ �Է��� �����͸� ��ü�� ��ȯ�ؼ� ���ھ������ �Ѱ��ش�.
		}
		
		List<Score> scores = scoreService.getScores(); //����ǥ�� �о���δ�.
		for(Score score: scores)
			System.out.println(score);
	}
}
