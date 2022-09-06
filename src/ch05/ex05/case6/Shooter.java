package ch05.ex05.case6;
//A has a B. A와 B가 관계를 가지고 있다.
public class Shooter {
	private Gun gun; //총잡이가 총을 가지고 있다.
	
	public void fire() {
		gun.fire(); //gun은 dependency.
	}

	public Gun getGun() {
		return gun;
	} //권총을 발사하면 get

	public void setGun(Gun gun) {
		this.gun = gun;
	} //권총을 뽑으면 set

}
//shooter의 fire 는 gun의 fire에 따라서 성공할수도 있고 실패할수도 있다.
//A는 B를 사용한다. A는 B에 의존한다.
//A has a B에서 B를 dependency(의존대상)라고 부른다.
//dependency는 멤버변수로 둔다.
