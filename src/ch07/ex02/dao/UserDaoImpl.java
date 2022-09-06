package ch07.ex02.dao;

import ch07.ex02.domain.User;

public class UserDaoImpl implements UserDao{
	@Override
	public User selectUser() {
		return new User("최한석");
	}
}

//Impl붙인거는 implements를 쓰는거라서
//수정과 삭제도 쓰기.