package ch09.ex04;

public class Buffer {
	private Integer val;
	
	public synchronized int remove() {
		while(val == null) {
			try {
				wait(); //object클래스에 존재.  remove를 호출하는 쓰레드가 wait.
			} catch(InterruptedException e) {}
		}
		
		int val = this.val;
		//과제] 꺼냈다. 를 표현하세요.
		this.val = null;
		
		notifyAll();
		
		return val;
	}
	
	
		public synchronized void add(Integer val) {
			while(this.val != null) {
				try {
					wait();
				}catch(InterruptedException e) {}
		}
			this.val = val;
			notifyAll(); //다른쓰레드들을 깨울수가 있다.
	}
}


//buffer - 임시저장소.
//synchronized - 동기화

/*
 * 동기화 - 안끊기고 계속 이어서 가는거
 * 전화도중에 친구가 1분만 잠시만 이러면 핸드폰들고 딴거안하고 1분동안 기다리는거
 * 
 */
