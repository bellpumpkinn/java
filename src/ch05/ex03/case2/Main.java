package ch05.ex03.case2;

public class Main {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		System.out.printf("%s\n%s\n\n", tv1, tv2); //주소값이 다른거 확인.
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
		
		tv1.setColor("red");
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
		
		tv2 = tv1; //tv1의 주소를 tv2가 복사함.
		//이때 tv2의 주소는 garbage로 되고 garbage collector가 없애버린다.
		System.out.printf("%s\n%s\n\n", tv1, tv2); //복사했기때문에 주소가 같다.
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
	
	}
}
