package ch05.ex01.case4;

public class User {
	private String name; //멤버변수 초기값안주는이유: 쓰레기값이 안들어가서
	
	public void setName(String name) {
		char familyName = name.charAt(0);
		
		if(familyName == '최')
			this.name = name;
		else this.name = "누구세요?";
	}
	
	public String getName() {
		return this.name;
	}
}
//setter를 통해서 입력을함
//참된 데이터만이 들어오게 하려고 setter, getter를 쓴다.