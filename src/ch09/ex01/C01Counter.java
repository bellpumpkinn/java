package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});
		
		Thread thread2 = new Thread(() -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		
		thread1.start(); //일을 시키려면 스타트메소드로 실행
		thread2.start();
		
		System.out.println("main end.");
	}
}

/*
run() 메소드에 작업하고 싶은 코드를 작성합니다.

start()는 스레드를 시작하는 메소드입니다.

sleep()은 일정 시간 동안 스레드를 정지 시키는 메소드입니다.

스레드를 생성하는 두 번째 방법은 Runnable 인터페이스를 구현하는 겁니다.

스레드 생성과 실행은 Thread 클래스를 상속받는 방법과 동일합니다.
*/
/*
Thread: 
process: 식당에 가면 식당에 관련된것만 있지 춤을추진않는다.
		자기만의 고유한 공간을 차지하고 있고 공간안에서 어떠한 일을 처리하는 현상.

식당에는 카운터종업원, 조리하는 종업원, 서빙종업원
클럽은 가드, md, 술타는사람

이런식으로 하나하나를 쓰레드라고 부른다.
병행적으로(동시에) 움직인다.
요리사는 자기 요리 계속하고 카운터는 계속 계산을 하고 있는다.

우리가 원래 하던거는 순차적실행. VM 하나에 쓰레드 하나가 메인부터 쭈욱 실행한거.

9장은 쓰레드클래스를 이용 쓰레드 2개이상 적용시켜볼것

메인을 실행했던걸 메인쓰레드.
메인쓰레드는 메인 실행하고 쓰레드객체 만듬. 그리고 스타트호출시킴(실행시키는건아님). 그리고 메인 end까지 실행.
그리고 쓰레드스타트되면 만든 쓰레드(thread1)가 실행됨.

숫자와 문자가 뒤죽박죽 섞여서 나오는 이유
-> 시간을 분배해서 일을 시킨다.
*/






