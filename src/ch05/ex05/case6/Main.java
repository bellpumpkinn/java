package ch05.ex05.case6;

public class Main {
	public static void main(String[] args) {
		Gun gun = new Gun(); //총을 한자루 준비한다.
		Shooter shooter = new Shooter();//shooter도 한명 준비한다.
		
		shooter.setGun(gun); //총잡이가 총을 찬다.
		shooter.fire();//슈터가 총을쏜다. 
	}
}
