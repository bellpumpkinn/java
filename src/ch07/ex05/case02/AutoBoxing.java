package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
		int a1 = 1;
		Integer a2 = new Integer(1);
		int a3 = new Integer(1); //오토언박싱
		Integer a4 = 1; //오토박싱. 1이 박싱되서 Integer타입으로 변환됨.
		
		boolean b1 = true;
		Boolean b2 = new Boolean(true);
		boolean b3 = new Boolean(true); //오토언박싱
		Boolean b4 = true; // 오른쪽이 오토박싱되서 객체에 담김
	}
}
//리터럴이 객체로 포장되는 현상 => 오토박싱
//기본타입에서 => wrapper클래스   : 오토박싱
