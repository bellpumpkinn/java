package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		//integer(����), decimal(����)
		int x = 10; //decimal(10����)
		System.out.println(Integer.toBinaryString(x));
		
		x = 012; // octal(8����) 8������ ���ھտ� 0�� ���δ�.
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA; // hexa(16����) 16������ ���ھտ� 0x�� ���δ�.
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010; // hexa(2����) 2������ ���ھտ� 0b�� ���δ�.
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567; //õ������ _(������ھ�)
		System.out.println(x + 1);
		
		double y = 1e1; //10��1��
		System.out.println(y);
	}
}
//boolean���� - is�� ����