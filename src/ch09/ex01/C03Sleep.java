package ch09.ex01;

public class C03Sleep {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		
			try { //�ð�[ms] 1000[ms] -> 1��
				Thread.sleep(1000); //throws���������� try�� �������.
			} catch(Exception e) {}
		}
	}
	
	
	
}


//01 a 2 b 3 �̰Ŵ� �ٲ������� �����尡 �ڴ°ǵ�
//���� vm�� �˾Ƽ� ���ִ°ǵ� ���⼱ ���� �����ϴ°�.

//�����ϳ���� 1���ڰ� �� ��� 1�� �ڰ�.
/*
run() �޼ҵ忡 �۾��ϰ� ���� �ڵ带 �ۼ��մϴ�.

start()�� �����带 �����ϴ� �޼ҵ��Դϴ�.

sleep()�� ���� �ð� ���� �����带 ���� ��Ű�� �޼ҵ��Դϴ�.

�����带 �����ϴ� �� ��° ����� Runnable �������̽��� �����ϴ� �̴ϴ�.

������ ������ ������ Thread Ŭ������ ��ӹ޴� ����� �����մϴ�.
*/