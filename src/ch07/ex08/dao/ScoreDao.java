package ch07.ex08.dao;

import java.util.List;

import ch07.ex08.domain.Score;

public interface ScoreDao {
	void intsertScore(Score score); //�����͸� �μ�Ʈ�Ѱ� �������� ����X
	List<Score> selsectScores(); //'���̺� �ִ� ���ڵ带 �а� �ִ�' �� ����
}	

//����Ʈ�� ����Ÿ���� �������̰ų� ����Ʈ�̰ų� �����ϳ�
//���⼱ ����Ʈ