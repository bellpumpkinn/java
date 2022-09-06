package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		Thread counter = new Thread(new Counter()); //쓰레드는 러너블타입의 값을 받는거
		counter.start();
		
		int tries = 1;
		while(counter.isAlive()) { //살아있으면 true가 리턴됨
			if(tries <= 2) {
				counter.join(1000); //물리적결합이 아니라 1초동안 바라보는거. 메인쓰레드가 카운터랑 조인하는거.
				System.out.print(Thread.currentThread().getName() + ": wait." + tries++);
			}else {
				System.out.println(Thread.currentThread().getName() + ": irritated.");
				counter.interrupt(); //counter를 깨우는거
				counter.join(); //counter가 죽을때까지 그냥 보는거
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}

