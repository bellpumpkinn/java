package ch07.ex05.case03;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1); //1이라는 밸류를 집어넣음. 키는 0    ->오토박싱되서 Integer형으로 변함
		list.add(2); //키를 인덱스라고 생각하면 됨.
		list.add(3);
		list.add(1); //1이라는 밸류로 똑같지만 키는 3이라서 문제가 없다.
		
		System.out.println(list);
		
		for(int i: list)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0)); //파라미터로 인덱스, 즉 키를 입력
		
		for(int i = 0; i < list.size(); i++)    //4개니까 list.size는 4.
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		//remove
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.remove(i) + " ");
		System.out.println();
		
		//과제] remove() list의 모든 원소를 삭제하라.
		/*
		int size = list.size();
		
		for(int i = 0; i < size; i++)
			list.remove(0); 
		System.out.println(list);*/
		for(int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		System.out.println(list);
		//3지우고, 2지우고, 1지우고, 0지우고
	}
}
//배열을 사용할때 크기를 알고 지정을 해줘야하는데 항상 그 크기를 알수가 없기때문에( 학생수 5명해놨는데 2명더 추가하려하면 고치기 귀찮음)
//그래서 이러한 한계를 극복하기 위해 List가 나왔다. List는 메모리가 허용가능한한 계속해서 학생수 추가 가능.
/*
리스트는 키, 밸류만 생각하면됨.   키를 인덱스라 생각하면됨.
add로 데이터를 집어넣고 , get으로 데이터를 읽었다.
데이터를 꺼내서 버리고 싶으면 remove라는 메서드를 이용.
*/