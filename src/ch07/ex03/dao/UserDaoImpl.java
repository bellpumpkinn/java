package ch07.ex03.dao;

import ch07.ex03.domain.User;

public class UserDaoImpl implements UserDao {

	// ���������� DB�� ���µ� ������ DB��� �а�
	private User user; //�������߰�    ���⿡ �迭��������
	
	@Override
	public User selectUser() { //������ �б�
		return this.user;
	}
	
	@Override
	public void insertUser(User user) { //�����;�����
		this.user = user;
	}
}

/*
�б�,����,����,����  => CRUD(Create Read Update Delete)
*/