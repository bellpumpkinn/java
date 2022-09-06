package ch07.ex04.case05;

import ch07.ex02.presentation.Console;
import ch07.ex04.case05.Dao.ScoreDao;
import ch07.ex04.case05.Dao.ScoreDaoImpl;
import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.presentation.ScoreIo;
import ch07.ex04.case05.service.ScoreService;
import ch07.ex04.case05.service.ScoreServiceImpl;

public class Main {
	public static void main(String[] args) {
		Score[] scores = new Score[5]; //�������� 5���� ���� ����.
		/*
		for(int i = 0; i < scores.length; i++)
			scores[i] = new Score((i+1) * 10, (i+1) * 10, (i+1) * 10);
		*/
		
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
	
		scoreIo.play();
		
	}
}
// �۽ý��Ͻ� ���� ���������̼�

/*
���� 3������ ������ ���� -> �������������Ϸ���.
dao �� ������ �������
���񽺰����� IO�� �������
�̷� ������ô� �������̽��� �д�.

�������� �Ķ���ͷ� ������÷� �޴´�.
IO�� ���񽺰��־�߸� �����Ҽ��ְ�,
���񽺴� dao�� ������ ���� ����.
��������������� �����ڸ� �̿��ؼ� �ߴ�.
�ٵ� ������ø� ���߿� �̿��ϰ������ ���͸� �̿��ؼ� �Ѵ�.
������ �ƴϸ� ���ͷ� ��������������� �Ѵ�.
A has a B. ���� DI�ϳĿ� ���� ������ �ƴϸ� ����
�ٷ� �Ϸ��� �����ڷ�, ���߿� �Ϸ��� ���ͷ�


���߼���: 1. ������(�����͸� ��Ÿ���� ��ü) DTO��� �θ��⵵�Ѵ�.
 	   2. �۽ý��Ͻ� DAO
 	   3. ����
 	   4. ���������̼�
 	   
�������� ü������ ���� - ���� -> �����ͺ��̽��� �����ϸ� �̰� �۽ý��Ͻ�
*/