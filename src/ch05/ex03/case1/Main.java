package ch05.ex03.case1;

public class Main {
	public static void main(String[] args) {
		Tv myTv = new Tv(); // Tv�� �Ѵ� ���� ��� ��.
		
		System.out.println(myTv);
		
		System.out.printf("%s, %b, %d\n", 
				myTv.getColor(), myTv.isPower(), myTv.getChannel());
		//��ü�� ���������� null, false, 0�� ����
		
		myTv.setColor("red");
		myTv.setPower(true);
		myTv.setChannel(7);  //�� Tv�� ������,������ �����ְ�, 7���� Ʋ����� Tv
	
		System.out.printf("%s, %b, %d\n", 
				myTv.getColor(), myTv.isPower(), myTv.getChannel());
	}
}
