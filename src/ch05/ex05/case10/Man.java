package ch05.ex05.case10;
//����޼��尡 �ٸ�����޼��带 ���Ҽ��ִٸ� �˷��ִ� ���̽�
public class Man {
	public void strip() {} //�ʹ����� Ƣ����°� ���� �׷��� void
	public void wash() {} //�İ��� �ʿ��Ѱ� ���� �׷��� void
	public void wear(Pajamas pajamas) {	}
	public void lie() {}
	
	public void sleep(Pajamas pajamas) {
		this.strip();
		this.wash();
		this.wear(pajamas);
		this.lie();    //���� 4���� sleep�ϳ��� ������. -> �ݺ����� �ڵ�ġ�°Ÿ� �ٿ���.
	}
	
}
