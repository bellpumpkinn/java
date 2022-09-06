package ch05.ex08.case2;
//this�� ��ü.
import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate regDate;
	
	public User() {} // User user = new User(); �̰� �״�� ������ �̰Ÿ� �����ε����ָ��.
	
	public User(String name, int age, LocalDate regDate) {
		this.name = name; //��ü.������� �ε� this�ȿ��� UserŸ���� ��ü�� �ִ�. �̰� VM�� �˾Ƽ� ����.
		this.age = age;
		this.regDate = regDate;		
	} //�̷��� �����ڸ� ���ָ� User user = new User(); <- �̺κ��� ä������Ѵ�.

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public LocalDate getRegDate() {
		return regDate;
	}
}	

/*
this��°��� ������.
User��� Ŭ�����ȿ������ϱ� this������ ������Ÿ���� Ŭ���� �̸��� User�̴�.
*/