package ch09.ex03;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();
		new Player(counter).start();
		new Player(counter).start();
	}
}


/*
������ ����.
��� 0 �̳��;��ϴµ� -1 1 2 3 4�̷������� �����ϱ� �����ƴ�.

�̰� �����ϴ¹�� => �ټ���(ť(queue)�� ���)
ť(Queue)�� ���� ó���� ���� �����͸� ���� ���� ������ FIFO(First-In First-Out) ����� ������ �ڷ� ����

��(lock)�ɰ� �ٽθ� ��Ǯ�� ȭ��ǵ��� ���ɰ� �ٽθ� ��Ǯ��

counter�� ȭ���1ĭ.
ȭ��� �������� �޼���. �޼��带 ���Ŵ°�.
�������� �޼��带 ȣ���ϸ� ���� �ɾ������ �ϴ� Ű���� = synchronized
���⿡ �ش��ϴ°� val.
*/