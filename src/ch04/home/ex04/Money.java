package ch04.home.ex04;

public class Money {
	public static void main(String[] args) {
		int price = 30_000;
		int tot = 0; // �տ� �� ��
		int tmp = 0; // ���� ��
		
		while(tot < price) {
			tmp = ((int)(Math.random() * 30) + 1) * 1000;// 1000�������� ǥ��
			System.out.println(tmp);
			tot += tmp;
		}
			System.out.printf("\n%d���� ���½��ϴ�.", tot);
		}
	}
//test���� unit test, integration test 2������ �ִ�.
/*
����] 3����¥�� ���ǰ��� ġ���.

������ 5�������� ����.
���� ���� ��(����)�� �������� �ʴ´�.
�������� ���� ������ ������.
�ѹ��� 3���� ���ϸ� ������.
����������, ���� �ݾ��� ����Ѵ�.
--

12000
2000
6000
10000

30000���� ���½��ϴ�.
*/
/*
		���� ģ �ڵ�.
		int money = 0;
		int sum = 0;
		
		do {
			money = ((int)(Math.random() * 30) + 1) * 1000; //õ������ ǥ���Ҽ��ְԵ�
			System.out.println(money);
			sum += money;
			
		} while(sum < 30000);
		
		System.out.printf("\n%d���� ���½��ϴ�.", sum);
*/