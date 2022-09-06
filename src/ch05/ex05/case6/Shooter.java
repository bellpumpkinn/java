package ch05.ex05.case6;
//A has a B. A�� B�� ���踦 ������ �ִ�.
public class Shooter {
	private Gun gun; //�����̰� ���� ������ �ִ�.
	
	public void fire() {
		gun.fire(); //gun�� dependency.
	}

	public Gun getGun() {
		return gun;
	} //������ �߻��ϸ� get

	public void setGun(Gun gun) {
		this.gun = gun;
	} //������ ������ set

}
//shooter�� fire �� gun�� fire�� ���� �����Ҽ��� �ְ� �����Ҽ��� �ִ�.
//A�� B�� ����Ѵ�. A�� B�� �����Ѵ�.
//A has a B���� B�� dependency(�������)��� �θ���.
//dependency�� ��������� �д�.
