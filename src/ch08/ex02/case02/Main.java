package ch08.ex02.case02;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("최한석", Level.COPPER);
		User user2 = new User("한아름", Level.SILVER);
		User user3 = new User("양승일", Level.GOLD);
		
		List<User> users = Arrays.asList(user1, user2, user3); //asList는 
		
		users.forEach(user -> {
			try {							//try는 익셉션 발생하면 본인이 책임지겠다는것.
				user.upgradeLevel();
			}catch(IllegalStateException e) {}
		});
		
		System.out.println(users);
	}
}
