package ch05.ex04.case2;

public class Player {
	public String name;
	public static String teamName; //5명이 팀이 똑같기때문에 static변수를 쓴다.
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static String getTeamName() {
		return teamName;
	}
	
	public static void setTeamName(String teamName) {
		Player.teamName = teamName;
	}
}
//static member 메서드도 있음.
//개체에는 관심없고 기능에만 관심있을때 static메소드 사용.
//[ex]random은 아무것에도 관심없고 그냥 랜덤숫자만 내니까 static메소드 사용.
//