package ch07.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Life alien1 = new Alien();  //ù��° �ܰ����� ����ü�� ����.
		Alien alien2 = new Alien(); //�ι��� �ܰ����� �ܰ������� ����.
		
		alien1.eat();
		alien2.eat();
		
		alien1.shout(); //�������̵�ȰŴ� �ڽĲ��� ����.
		alien2.shout(); //ȣ���� �� �����ѵ�
		
		Life.eat();    //static����, static�޼���� ���λ�� Ŭ�������� ���� �ȴ�.
		Alien.eat();   //8,9����ó������ instance�޼���� �ְ��� ���ɼ��� �ִ�.
	}
}


/*
�������̵幮��
-> �������̵��ϸ� �ڽ��� �޼��带 ����.

//static�޼���� �������̵� �ȵ�. ����� �ȵȴ�.
//static�޼���� ��ӵǴ°� �ƴϴ�.

static����, static�޼���� ���λ�� Ŭ�������� ���� �ȴ�.
*/