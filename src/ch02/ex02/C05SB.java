package ch02.ex02;

public class C05SB {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("�츮 ���� "); //�޸�������
		
		int len = src.length();
		System.out.println("length: " + len);
		
		src.append("¢�´�."); //��Ʈ�����ۿ��� ���̴� ����
		src.replace(3, 4, "�����");
		
		String str = src.toString();
		
		System.out.println(src); //��Ʈ������Ÿ��
		System.out.println(str); //��Ʈ��Ÿ��    
	}
}
