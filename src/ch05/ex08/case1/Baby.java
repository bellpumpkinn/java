package ch05.ex08.case1;

public class Baby {
	private String name;

	public Baby() {}  // <-new Baby();�� �긦 ���Ѱ�.
	//6������ �⺻������. �̰� ������ main���� ������.
	public Baby(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
//�⺻������