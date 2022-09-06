package ch04.ex02;

public class C01Switch {
	public static void main(String[] args) {
		int grade = 3;
		String coupon = "";
		
		//switch 옆의 grade는 기준값, case옆의 숫자는 비교값.
		switch(grade) { 
		//grade값이 3이면 case 3으로 건너뛴다.
		case 3: coupon += "10,000원 ";
		case 2: coupon += "5,000원 ";
		case 1: coupon += "1,000원 ";
		}
		
		System.out.println(coupon);
	}
}
