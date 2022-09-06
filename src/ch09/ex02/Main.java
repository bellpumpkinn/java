package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		Thread counter = new Thread(new Counter()); //������� ���ʺ�Ÿ���� ���� �޴°�
		counter.start();
		
		int tries = 1;
		while(counter.isAlive()) { //��������� true�� ���ϵ�
			if(tries <= 2) {
				counter.join(1000); //������������ �ƴ϶� 1�ʵ��� �ٶ󺸴°�. ���ξ����尡 ī���Ͷ� �����ϴ°�.
				System.out.print(Thread.currentThread().getName() + ": wait." + tries++);
			}else {
				System.out.println(Thread.currentThread().getName() + ": irritated.");
				counter.interrupt(); //counter�� ����°�
				counter.join(); //counter�� ���������� �׳� ���°�
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}

