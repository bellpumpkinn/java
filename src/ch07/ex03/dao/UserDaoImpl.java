package ch07.ex03.dao;

import ch07.ex03.domain.User;

public class UserDaoImpl implements UserDao {

	// 실전에서는 DB로 가는데 지금은 DB대신 둔거
	private User user; //데이터추가    여기에 배열넣을거임
	
	@Override
	public User selectUser() { //데이터 읽기
		return this.user;
	}
	
	@Override
	public void insertUser(User user) { //데이터쓰기담당
		this.user = user;
	}
}

/*
읽기,쓰기,수정,삭제  => CRUD(Create Read Update Delete)
*/