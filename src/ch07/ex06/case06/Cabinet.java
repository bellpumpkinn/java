package ch07.ex06.case06;
//A�� �θ�� �ΰ��ִ�Ŭ����
public class Cabinet <T extends A>{ //AŸ�԰������ִ� T, A���� Ÿ������ �������.
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
