package ch05.ex09.case1;

public class Init {
	private static int s; 
	private int i;
	
	static {
		Init.s = 1;
		// this.i = 1;// -> ��������: this������ �޼���ȿ�������. 
		// this������ ��� erroró�� �Ѱ��̴�.
		System.out.println("static{}");
	}
	//�ν��ϼ��ʱ�ȭ�� �տ��� �̸��� �����ʴ´�.
	{
		Init.s = 1;
		this.i = 1;
		System.out.println("{}"); //��ü�� ������ ���Ŀ� �����.
	} 
	
	public Init() {
		Init.s = 1;
		this.i = 1;
		System.out.println("Init()");
	} //�ݵǾ� ����
	
	public Init(int i) {
		Init.s = i;
		this.i = i;
		System.out.println("Init(int)");
		
	}
	
}
