package ch07.ex08.dao;

import java.util.List;

import ch07.ex08.domain.Score;

public interface ScoreDao {
	void intsertScore(Score score); //데이터를 인서트한거 나머지엔 관심X
	List<Score> selsectScores(); //'테이블에 있는 레코드를 읽고 있다' 로 접근
}	

//셀렉트는 리턴타입이 도메인이거나 리스트이거나 둘중하나
//여기선 리스트