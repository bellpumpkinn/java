package ch09.ex02;

public class Counter implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		for(char c = 'a';c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() + ": " + c);
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep");
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
				System.out.println(Thread.currentThread().getName() + ": interrupted");
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}

//쓰레드가 되면 할일을 런메소드안에 써줌.
//Thread.currentThread().getName() -> 현재쓰레드의 이름을 알아냄.
