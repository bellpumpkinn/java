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
		
		thread1.start(); //���� ��Ű���� ��ŸƮ�޼ҵ�� ����
		thread2.start();
		
		System.out.println("main end.");
	}
}

/*
run() �޼ҵ忡 �۾��ϰ� ���� �ڵ带 �ۼ��մϴ�.

start()�� �����带 �����ϴ� �޼ҵ��Դϴ�.

sleep()�� ���� �ð� ���� �����带 ���� ��Ű�� �޼ҵ��Դϴ�.

�����带 �����ϴ� �� ��° ����� Runnable �������̽��� �����ϴ� �̴ϴ�.

������ ������ ������ Thread Ŭ������ ��ӹ޴� ����� �����մϴ�.
*/
/*
Thread: 
process: �Ĵ翡 ���� �Ĵ翡 ���õȰ͸� ���� ���������ʴ´�.
		�ڱ⸸�� ������ ������ �����ϰ� �ְ� �����ȿ��� ��� ���� ó���ϴ� ����.

�Ĵ翡�� ī����������, �����ϴ� ������, ����������
Ŭ���� ����, md, ��Ÿ�»��

�̷������� �ϳ��ϳ��� �������� �θ���.
����������(���ÿ�) �����δ�.
�丮��� �ڱ� �丮 ����ϰ� ī���ʹ� ��� ����� �ϰ� �ִ´�.

�츮�� ���� �ϴ��Ŵ� ����������. VM �ϳ��� ������ �ϳ��� ���κ��� �޿� �����Ѱ�.

9���� ������Ŭ������ �̿� ������ 2���̻� ������Ѻ���

������ �����ߴ��� ���ξ�����.
���ξ������ ���� �����ϰ� �����尴ü ����. �׸��� ��ŸƮȣ���Ŵ(�����Ű�°Ǿƴ�). �׸��� ���� end���� ����.
�׸��� �����彺ŸƮ�Ǹ� ���� ������(thread1)�� �����.

���ڿ� ���ڰ� ���׹��� ������ ������ ����
-> �ð��� �й��ؼ� ���� ��Ų��.
*/





