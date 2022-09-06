package ch07.ex02.dao;

import ch07.ex02.domain.User;

public interface UserDao {
	public User selectUser(); 
}

//도메인클래스이름 뒤에 Dao를 붙여준다.
//읽기는 select
//selectUser는 유저를 읽는다.

//dao에 있는 객체들은 dao개층(layer)에 있다라고 표현.


//dao와 service는 디펜던시