package ch05.ex03.case3;

public class Main {
	public static void main(String[] args) {
		House house1 = new House(); //new House();�� '���� ��ä ������'�� ��.
		House house2 = null;
		
		house1.setAddress("���� ������ ���ﵿ");
		
		house2 = house1;
		
		System.out.println(house2.getAddress());
	}
}
