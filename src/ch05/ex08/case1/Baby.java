package ch05.ex08.case1;

public class Baby {
	private String name;

	public Baby() {}  // <-new Baby();는 얘를 콜한거.
	//6번줄이 기본생성자. 이게 없으면 main에서 에러뜸.
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
//기본생성자