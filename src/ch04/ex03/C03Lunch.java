package ch04.ex03;

public class C03Lunch {
	public static void main(String[] args) {
		int calorie = 0;
		int food = 0;
		
		while(calorie < 30) {
			food = (int)(Math.random() * 10) + 1;
			
			if(food % 5 == 0) {
				System.out.println("상한 음식을 뱉다.");
				break; //break은 if를 제외한 다른 제어문에서 빠져나온다.
			} //break는 되도록 안쓰는게 좋다.
			
			calorie += food;
		}
		
		System.out.println(calorie + "cal.만큼 먹었습니다.");
	}
}
/*
배 부를때까지 먹을거야.
배 고프면 먹어야지.
*/