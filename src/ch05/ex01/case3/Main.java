package ch05.ex01.case3;
//캡슐화
public class Main {
	public static void main(String[] args) {
		/*
		User user1 = new User();
		User user2 = new User();
		
		user1.name = "최한석";
		user1.age = 12;
		
		user2.name = "한아름";
		user2.age = 22;
		*///VM이 메인을 콜하면 메인이 실행되면서 메인이 set,getName다 호출했다.
		User user = new User();
		user.setName("최한석");
		user.setAge(12);
		
		user.setName("한아름");
		//user.name = "양승일";
		
		System.out.printf("%s, %d\n", user.getName(), user.getAge());	
		//System.out.printf("%s, %d\n", user.name, user.age);
	}
}
//감추면 접근이 어려우니까
//getter와 setter를 만들어서 데이터에 접근한다.
