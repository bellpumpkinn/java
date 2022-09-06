package ch05.ex08.case3;
//case1,2는 this변수의 정체를 알려주는거
//case3은 this변수의 호출을 알려주는거
public class Citrus {
	private String name;
	
	public Citrus() {
		//this.name = "레드향"; 이 나쁜코드인이유 1.뜻이 중복된다, 2.하드코딩
		//this.Citrus("레드향"); //new가 없어서 오류가뜸
		//new Citrus("레드향"); //new하면 객체가 생성이됨.
		this("레드향"); //얘를 써야지 null이 아닌 레드향이뜬다.
		//이렇게 쓰는 이유는 코드중복을 최소화하기위해 쓴다.
	}
	
	public Citrus (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
