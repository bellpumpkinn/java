package ch07.ex05.case09;
//instanceof 에서 리턴되는 타입은 boolean
public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B "; //c객체는 B클래스의 인스턴스이다. 참
		if(c instanceof A) msg += "A "; //c는 A클래스의 인스턴스이다. 참
		if(c instanceof Object) msg += "Object "; //c객체는 Object클래스의 인스턴스이다. 참
		System.out.println(msg);
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B "; //b객체는 B클래스의 인스턴스이다. 참.
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg += "Object "; //b객체는 Object클래스의 인스턴스이다. 참.
		System.out.println(msg);
		
		//if(b instanceof F)  엮여야지 쓸수가 있다.
		//if(c instanceof F)
		
		F f = new F();
		msg = "";
		//if(f instanceof C) msg += "C ";
		//if(f instanceof B) msg += "B ";
		if(f instanceof A) msg += "A "; //f객체는 A타입안가지니까 안나옴.
		if(f instanceof Object) msg += "Object ";
		System.out.println(msg);
	}
}

/*
 * instanceof 에서 리턴되는 타입은 boolean
 * instanceof에 interface는 자유롭게 쓸수있지만 클래스는 엮인것들만 쓸수있다.
 * 부모로 쓰고싶으면 interface로 쓰는게 편하다.
 */
