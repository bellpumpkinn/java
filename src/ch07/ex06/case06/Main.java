package ch07.ex06.case06;

public class Main {
	public static void main(String[] args) {
		Cabinet<A> cabinet1 = new Cabinet<>();//A타입의 원소를 갖는 캐비넷.
		Cabinet<B> cabinet2 = new Cabinet<>();
		//Cabinet<C> Cabinet;
		
		A[] arr1 = {new A(), new A()};
		B[] arr2 = {new B(), new B()};
		C[] arr3 = {new C(), new C()};
		D[] arr4 = {new D(), new D()};
		
		cabinet1.getLastVal(arr1);
		cabinet1.getLastVal(arr2); //B가 A로 프로모션이 되서 쓰인거임.
		cabinet2.getLastVal(arr2);
		//cabinet2.getLastVal(arr1); 프로모션이 되지않음.
		
		//cabinet1.getFinalVal(arr1); //C이하가 아니라서 에러가뜬다.
		//cabinet1.getFinalVal(arr2); //C이하가 아니라서 에러가뜬다.
		cabinet1.getFinalVal(arr3);
		cabinet1.getFinalVal(arr4);
	}
}

/*
 * 
 */
