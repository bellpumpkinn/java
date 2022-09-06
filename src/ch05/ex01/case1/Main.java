package ch05.ex01.case1;

public class Main {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 35;
		int second = 30;
		//하나 생각했는데 코드는 3개가 나와있음 - > 나쁜코드
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
		Time time = new Time(); //클래스로 데이터를 만들때는 new를 쓴다.
		//new 뒤의 Time()은 생성자다.
		time.hour = 12;  //time객체에 있는 hour
		time.minute = 35; //time은 스택에있다가 .붙이면 heap에 다녀와서 거기주소알아옴.
		time.second = 30; //집에 hour,min,sec다 집어넣음
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		//time은 지역변수. 메인메서드 내에서 쓴거기때문에
		
		Time time2 = new Time(); //객체가 2개 생성됐다.
		time2.hour = 10;
		time2.minute = 30; //time2에는 2번째 객체주소가 들어있다.
		time2.second = 27;
		System.out.printf("%d시 %d분 %d초\n", time2.hour, time2.minute, time2.second);
		
		System.out.println(time); //time변수의 주소값 .toString()이 생략됨.
		System.out.println(time2.toString()); //time2변수의 주소값
		//객체.toString()이 호출되면 [클래스의 풀네임+@주소값]이 리턴된다.
		//클래스는 같지만 해시코드(@주소를 말함)가 다르다.
	}
}
