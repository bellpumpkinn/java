package ch06.ex06.case07;

public class Main {
	public static void main(String[] args) {
		//Code를 안쓸때
		int val = 1;
		
		switch(val) {
		case 1: // 유저 추가
		case 2: 
		}
		
		//Code가 있는경우
		switch(val) {
		case Code.USER_ADD:    //가독성이 좋아진다.
		case Code.USER_DEL: 
		}
	}
}


//interface