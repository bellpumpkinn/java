package ch07.ex02;

import ch07.ex02.dao.UserDao;
import ch07.ex02.dao.UserDaoImpl;
import ch07.ex02.presentation.Console;
import ch07.ex02.presentation.UserIo;
import ch07.ex02.service.UserService;
import ch07.ex02.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao); //서비스 has a Dao
		UserIo userIo = new UserIo(userService); //IO has a 서비스
		
		Console.info("시작");
		userIo.play();
		Console.info("끝.");
	}
}

//메인에서 조립한다.
//root패키지
//main을 ex02바로 밑에 올림.
//3개의 부품(객체)가 있고 객체들의 집합이 앱.