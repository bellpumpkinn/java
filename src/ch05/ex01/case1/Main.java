package ch05.ex01.case1;

public class Main {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 35;
		int second = 30;
		//�ϳ� �����ߴµ� �ڵ�� 3���� �������� - > �����ڵ�
		System.out.printf("%d�� %d�� %d��\n", hour, minute, second);
		
		Time time = new Time(); //Ŭ������ �����͸� ���鶧�� new�� ����.
		//new ���� Time()�� �����ڴ�.
		time.hour = 12;  //time��ü�� �ִ� hour
		time.minute = 35; //time�� ���ÿ��ִٰ� .���̸� heap�� �ٳ�ͼ� �ű��ּҾ˾ƿ�.
		time.second = 30; //���� hour,min,sec�� �������
		System.out.printf("%d�� %d�� %d��\n", time.hour, time.minute, time.second);
		
		//time�� ��������. ���θ޼��� ������ ���ű⶧����
		
		Time time2 = new Time(); //��ü�� 2�� �����ƴ�.
		time2.hour = 10;
		time2.minute = 30; //time2���� 2��° ��ü�ּҰ� ����ִ�.
		time2.second = 27;
		System.out.printf("%d�� %d�� %d��\n", time2.hour, time2.minute, time2.second);
		
		System.out.println(time); //time������ �ּҰ� .toString()�� ������.
		System.out.println(time2.toString()); //time2������ �ּҰ�
		//��ü.toString()�� ȣ��Ǹ� [Ŭ������ Ǯ����+@�ּҰ�]�� ���ϵȴ�.
		//Ŭ������ ������ �ؽ��ڵ�(@�ּҸ� ����)�� �ٸ���.
	}
}
