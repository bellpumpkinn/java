package ch08.ex02.case01;

public class Main {
	public static void main(String[] args) {
		Day day = Day.TUESDAY; //이넘.코드명 그리고 이넘이 데이터타입이 된다.
		
		String dayName = "";
		switch(day) {
		case MONDAY: dayName = "월요일"; break;
		case TUESDAY: dayName = "화요일";
		}
		
		System.out.println(dayName);
		
	}
}
