package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		
		switch(grade) {
		case 3: coupon = "10,000원"; break;
		case 2: coupon = "5,000원"; break;
		case 1: coupon = "1,000원"; //마지막엔 어차피 빠지니까 break 노쓸모
		}
		System.out.println(coupon);
	}
}
