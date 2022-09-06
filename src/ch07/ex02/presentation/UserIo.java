package ch07.ex02.presentation;

import ch07.ex02.service.UserService;

public class UserIo {
	private UserService userService; //IO의 디펜던시는 서비스
	
	public UserIo(UserService userService) {
		this.userService = userService; //DI(Dependency Injection)
	}
	
	public void play() {
		Console.info(userService.getUser());
	}
}

//Io는 출력하고 끝나서 인터페이스를 만들지않음.
//info가 출력한다는 메소드

/*
A has a B 관계에서 DI가 나온다.
DI생성방법 2가지. => 1.생성자, 2.setter
*/