package ch07.ex03.service;

import ch07.ex03.domain.User;
import ch07.ex03.dao.UserDao;

public class UserServiceImpl implements UserService {
	private UserDao userDao;	//유저 서비스의 디펜던시는 유저 디에이오
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
	
	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}
}

//퍼시스턴스는 서비스랑만 대화가능
//프레젠테이션은 서비스랑만 대화가능
//서비스는 퍼시랑 프레젠 둘다 대화가능
//대화방법 : 1.메서드콜, 2.리턴값받기