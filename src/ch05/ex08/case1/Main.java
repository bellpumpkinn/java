package ch05.ex08.case1;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby(); 
		baby.setName("초롱이");    //여기까지는 애기가 생기고 이름을 지어주는거
		
		Baby baby2 = new Baby("튼튼이"); //baby2는 태어나면서부터 이름을 가지고 있음.
		
	}
}

//클래스.메서드 - static메서드
//객체.메서드 - 인스턴스메소드                            
//new 메서드 - 생성자