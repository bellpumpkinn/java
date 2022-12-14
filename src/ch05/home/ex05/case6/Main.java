package ch05.home.ex05.case6;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone(); //폰이 하나 있다.
		Person person = new Person();
		
		person.setName("최한석");
		phone.setMakerName("삼성");
		phone.setPrice(1_000_000);
		//위의 부분까지는 폰과 사람은 따로 존재.
		
		person.setPhone(phone);//여기서 부터 하나의 관계가 된다. has a관계를 맺음.
		person.sendMsg();
		person.call();
		person.playGame();
	}
}

/*
최한석은 삼성폰을 1백만원 주고 샀습니다.
손에 든 폰을 보니 흐뭇합니다.

메세지를 보내 봅니다.
답장이 없어, 전화를 걸어보니, 연결이 안되네요.
잠시 뒤에 다시 연락해 보렵니다.
기다리는 동안 폰으로 게임을 합니다.
*/
// A has a B 를 이용하는 과제.