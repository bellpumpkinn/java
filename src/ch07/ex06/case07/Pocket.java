package ch07.ex06.case07;
//와일드카드
import java.util.List;

public class Pocket {
	{
		int i = 1 * 2;
		double d = 1.0 * 2.0;
		i = new Integer(1) + new Integer(2);
		d = new Double(1.0) + new Double(2.0);
		
		//new Number(1) * new Number(2);
	}
	
	// unbounded wildcard
	public void printList(List<?> list) {
		System.out.println(list);
	}
	
	//upper bounded wildcard
	public double add(List<? extends Number> list) {
		double sum = 0;
		for(Number n: list) sum += n.doubleValue();
		//number로 해줘야 뭐가 들어오든 프로모션됨.
		
		return sum;
	}
	
	//lower bounded wildcard
	public List<? super Integer> add2(List<? super Integer> list){
		return list;
	}
}
/*
Upper Bounded 와일드 카드 (more specific) : 매개 변수에 대한 제한을 완화시키는 목적으로 쓰인다. 
					   <? extends T>와 같이 쓰이는 경우 T이거나 T의 자식 클래스 타입과 호환해서 사용할 수 있다.
					   구체적인 예시로, List<? extends Number> 와 같이 쓰이는 경우 List<Integer>, List<Double>등 Number의 하위 클래스를 모두 받아들일 수 있다.

Lower Bounded 와일드 카드 (more general): Upper Bounded와 반대로 <? super T>와 같이 쓰이면 T이거나 T의 부모 클래스 타입과 호환해서 쓸 수 있다. 
									   Upper Bounded에 비해 사용할 경우는 많지 않다고 본다.
 */

/*
 * 와일드카드 - 제너릭타입을 결정안하면 모양 : ?
 * class를 디자인하는데 제너릭타입을 여전히 제너릭으로 냅두고싶으면
 */ 