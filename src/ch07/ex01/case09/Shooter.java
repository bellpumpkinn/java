package ch07.ex01.case09;

public class Shooter {
	private Gun gun;  //여기의 타입이 인터페이스여야한다.
	
	public void fire() {
		this.gun.fire();
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
}


//Shooter has a Gun
//has a 관계


/*
유지보수를 위해서
dependency의 타입은 인터페이스로 둔다 => 확장성을 확보하기 위해서
확장성이 있어야지 다양한 총을 사용할수있다.
*/