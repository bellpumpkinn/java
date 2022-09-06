package ch07.ex02.presentation;

import ch07.ex02.service.UserService;

public class UserIo {
	private UserService userService; //IO�� ������ô� ����
	
	public UserIo(UserService userService) {
		this.userService = userService; //DI(Dependency Injection)
	}
	
	public void play() {
		Console.info(userService.getUser());
	}
}

//Io�� ����ϰ� ������ �������̽��� ����������.
//info�� ����Ѵٴ� �޼ҵ�

/*
A has a B ���迡�� DI�� ���´�.
DI������� 2����. => 1.������, 2.setter
*/