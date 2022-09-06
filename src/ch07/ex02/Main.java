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
		UserService userService = new UserServiceImpl(userDao); //���� has a Dao
		UserIo userIo = new UserIo(userService); //IO has a ����
		
		Console.info("����");
		userIo.play();
		Console.info("��.");
	}
}

//���ο��� �����Ѵ�.
//root��Ű��
//main�� ex02�ٷ� �ؿ� �ø�.
//3���� ��ǰ(��ü)�� �ְ� ��ü���� ������ ��.