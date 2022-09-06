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
		Score[] scores = new Score[5]; //점수넣을 5개의 공간 마련.
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
// 퍼시스턴스 서비스 프레젠테이션

/*
앱의 3계층을 나누는 이유 -> 유지보수쉽게하려구.
dao 는 서비스의 디펜던시
서비스계층은 IO의 디펜던시
이런 디펜던시는 인터페이스로 둔다.

생성자의 파라미터로 디펜던시로 받는다.
IO는 서비스가있어야만 존재할수있고,
서비스는 dao가 없으면 일을 못함.
디펜던시인젝션을 생성자를 이용해서 했다.
근데 디펜던시를 나중에 이용하고싶으면 세터를 이용해서 한다.
생성자 아니면 세터로 디펜던시인젝션을 한다.
A has a B. 언제 DI하냐에 따라서 생성자 아니면 세터
바로 하려면 생성자로, 나중에 하려면 세터로


개발순서: 1. 도메인(데이터를 나타내는 객체) DTO라고 부르기도한다.
 	   2. 퍼시스턴스 DAO
 	   3. 서비스
 	   4. 프레젠테이션
 	   
데이터의 체계적인 집합 - 정보 -> 데이터베이스에 저장하면 이게 퍼시스턴스
*/