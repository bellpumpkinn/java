package ch07.ex02.dao;

import ch07.ex02.domain.User;

public interface UserDao {
	public User selectUser(); 
}

//������Ŭ�����̸� �ڿ� Dao�� �ٿ��ش�.
//�б�� select
//selectUser�� ������ �д´�.

//dao�� �ִ� ��ü���� dao����(layer)�� �ִٶ�� ǥ��.


//dao�� service�� �������