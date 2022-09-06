package ch09.ex01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class C02Executor {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		}; //���ʺ�Ÿ���� �� 2���� �����.
		
		Runnable r2 = () -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		};
		
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(r1); //r1�� ������Ǯ�ȿ� ��.
		executor.execute(r2); //r2�� ������Ǯ�ȿ� ��.
	}
}
//newCachedThreadPool  -  thread���� ���ϼ��ִ� Ǯ�� ����
/*
run() �޼ҵ忡 �۾��ϰ� ���� �ڵ带 �ۼ��մϴ�.

start()�� �����带 �����ϴ� �޼ҵ��Դϴ�.

sleep()�� ���� �ð� ���� �����带 ���� ��Ű�� �޼ҵ��Դϴ�.

�����带 �����ϴ� �� ��° ����� Runnable �������̽��� �����ϴ� �̴ϴ�.

������ ������ ������ Thread Ŭ������ ��ӹ޴� ����� �����մϴ�.
*/