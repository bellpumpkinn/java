package ch07.ex08;

import java.util.ArrayList;
import java.util.List;

import ch07.ex08.dao.ScoreDao;
import ch07.ex08.dao.ScoreDaoImpl;
import ch07.ex08.domain.Score;
import ch07.ex08.presentation.ScoreIo;
import ch07.ex08.service.ScoreService;
import ch07.ex08.service.ScoreServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<Score> scores = new ArrayList<>();
		
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		ScoreService scoreService = new ScoreServiceImpl(scoreDao); //service has a dao
		ScoreIo scoreIo = new ScoreIo(scoreService); //IO has a service
		
		scoreIo.play();
	}
}

//1차로 A has a B쓰고
//곤란하면 extends써라

//dao는 DB가 있어야 사용가능. 