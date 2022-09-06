package ch08.ex02.case001;

public class Main {
	public static void main(String[] args) {
		Way way = Way.LEFT;
		String direction = "";
		
		if(way == Way.LEFT) direction = "왼쪽";
		else direction = "오른쪽";
		
		System.out.println(direction);
	}
}

//단점을 극복하기위해 case002
