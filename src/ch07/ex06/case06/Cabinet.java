package ch07.ex06.case06;
//A를 부모로 두고있는클래스
public class Cabinet <T extends A>{ //A타입가지고있는 T, A이하 타입으로 읽으면됨.
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) {
		return arr[arr.length - 1];
	}
}
/*
 * 
 */
