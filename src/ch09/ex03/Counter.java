package ch09.ex03;
//��ũ�γ����� ����
public class Counter {
	private int val;
	
	public synchronized void increase() {
		val++;
	}
	
	public synchronized void decrease() {
		val--;
	}
	
	public synchronized void print() {
		System.out.print(val + " ");
	}
}


//���������Ͱ� �����ϴ� counter �ɿ���
//val++�� ���ÿ� �̷����°� �����ִ°� ��ũ�γ�����


