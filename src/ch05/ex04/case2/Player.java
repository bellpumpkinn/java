package ch05.ex04.case2;

public class Player {
	public String name;
	public static String teamName; //5���� ���� �Ȱ��⶧���� static������ ����.
	
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
//static member �޼��嵵 ����.
//��ü���� ���ɾ��� ��ɿ��� ���������� static�޼ҵ� ���.
//[ex]random�� �ƹ��Ϳ��� ���ɾ��� �׳� �������ڸ� ���ϱ� static�޼ҵ� ���.
//