package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a"; //string�� ����� �������
		b = s == "a"; //true
		
		s = new String("a"); //�̰ſ� ���� ���ش� 5���� ���� ���ذ� �ȴ�.
		b = s == "a";  //false
		
		b = s.equals("a"); //equals �޼��� - s�� ��䰪�̶� ()�ȿ� ��䰪�� ������ Ȯ�����ش�.
		//s�� �־� equals ������ "a"�� ������
		System.out.println(b);
	}
}
