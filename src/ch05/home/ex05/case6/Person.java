package ch05.home.ex05.case6;

public class Person {
	private Phone phone;
	private String name;
	
	public void sendMsg() {
		phone.sendMsg(); //dependency인 phone을 이용해서 메세지를 보낸다.
	}
	
	public void call() {
		phone.call(); //dependency인 phone을 이용해서 전화를 한다.
	}
	
	public void playGame() {
		phone.playGame();
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public void setName(String name) {
		this.name = name;
	}
}
//반환값이 없는경우 리턴타입 대신 void를 사용한다.
//dependency를 이용하는 이유는 남한테 떠넘기기위해서 내가 하기 싫어서 이용을함