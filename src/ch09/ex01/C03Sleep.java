package ch09.ex01;

public class C03Sleep {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		
			try { //시간[ms] 1000[ms] -> 1초
				Thread.sleep(1000); //throws묶여있으면 try로 묶어야함.
			} catch(Exception e) {}
		}
	}
	
	
	
}


//01 a 2 b 3 이거는 바뀔떄마다 쓰레드가 자는건데
//원래 vm이 알아서 해주는건데 여기선 내가 지정하는거.

//숫자하나찍고 1초자고 또 찍고 1초 자고.
/*
run() 메소드에 작업하고 싶은 코드를 작성합니다.

start()는 스레드를 시작하는 메소드입니다.

sleep()은 일정 시간 동안 스레드를 정지 시키는 메소드입니다.

스레드를 생성하는 두 번째 방법은 Runnable 인터페이스를 구현하는 겁니다.

스레드 생성과 실행은 Thread 클래스를 상속받는 방법과 동일합니다.
*/