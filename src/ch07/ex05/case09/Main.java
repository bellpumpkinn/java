package ch07.ex05.case09;
//instanceof ���� ���ϵǴ� Ÿ���� boolean
public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B "; //c��ü�� BŬ������ �ν��Ͻ��̴�. ��
		if(c instanceof A) msg += "A "; //c�� AŬ������ �ν��Ͻ��̴�. ��
		if(c instanceof Object) msg += "Object "; //c��ü�� ObjectŬ������ �ν��Ͻ��̴�. ��
		System.out.println(msg);
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B "; //b��ü�� BŬ������ �ν��Ͻ��̴�. ��.
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg += "Object "; //b��ü�� ObjectŬ������ �ν��Ͻ��̴�. ��.
		System.out.println(msg);
		
		//if(b instanceof F)  �������� ������ �ִ�.
		//if(c instanceof F)
		
		F f = new F();
		msg = "";
		//if(f instanceof C) msg += "C ";
		//if(f instanceof B) msg += "B ";
		if(f instanceof A) msg += "A "; //f��ü�� AŸ�ԾȰ����ϱ� �ȳ���.
		if(f instanceof Object) msg += "Object ";
		System.out.println(msg);
	}
}

/*
 * instanceof ���� ���ϵǴ� Ÿ���� boolean
 * instanceof�� interface�� �����Ӱ� ���������� Ŭ������ ���ΰ͵鸸 �����ִ�.
 * �θ�� ��������� interface�� ���°� ���ϴ�.
 */
