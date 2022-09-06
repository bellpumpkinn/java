package ch09.ex01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class C02Executor {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		}; //러너블타입의 값 2개를 만든거.
		
		Runnable r2 = () -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		};
		
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(r1); //r1이 스레드풀안에 들어감.
		executor.execute(r2); //r2가 스레드풀안에 들어감.
	}
}
//newCachedThreadPool  -  thread들이 모일수있는 풀을 만듬
/*
run() 메소드에 작업하고 싶은 코드를 작성합니다.

start()는 스레드를 시작하는 메소드입니다.

sleep()은 일정 시간 동안 스레드를 정지 시키는 메소드입니다.

스레드를 생성하는 두 번째 방법은 Runnable 인터페이스를 구현하는 겁니다.

스레드 생성과 실행은 Thread 클래스를 상속받는 방법과 동일합니다.
*/