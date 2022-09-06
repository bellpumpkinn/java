package ch09.ex04;

public class Buffer {
	private Integer val;
	
	public synchronized int remove() {
		while(val == null) {
			try {
				wait(); //objectŬ������ ����.  remove�� ȣ���ϴ� �����尡 wait.
			} catch(InterruptedException e) {}
		}
		
		int val = this.val;
		//����] ���´�. �� ǥ���ϼ���.
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
			notifyAll(); //�ٸ���������� ������� �ִ�.
	}
}


//buffer - �ӽ������.
//synchronized - ����ȭ

/*
 * ����ȭ - �Ȳ���� ��� �̾ ���°�
 * ��ȭ���߿� ģ���� 1�и� ��ø� �̷��� �ڵ������ ���ž��ϰ� 1�е��� ��ٸ��°�
 * 
 */
