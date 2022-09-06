package ch07.ex04.case01;
//배열의 정체는 객체. 힙에 생김
public class Array {
	public static void main(String[] args) {
		String[] strs = new String[3]; //개수를 집어넣음 3개 이 3을 length라고 부르기도 한다.
		System.out.println(strs);
		
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3]; 
		System.out.println(ints);
		
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		System.out.printf("%d %d %d\n", integers[0], integers[1], integers[2]);
		System.out.printf("%d %d %d\n", strs[0], strs[1], strs[2]);
		
		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		
		for(int i = 0; i < ints.length; i++) ints[i] = i;
			
		for(int i = 0; i < ints.length; i++)
			System.out.println(ints[i] + " ");
		
		System.out.println("\n");
		
		//아래를 for each라고 부른다. : 을중심으로 오른쪽은 컬렉션. 왼쪽은 원소를 담을 변수
		//iterating이 목적일때 이 코드를 쓴다.
		for(int i: ints) System.out.print(i + " ");
		//컬렉션변수가 더이상 꺼낼수없을때 끝낸다.
		int[] array = {0, 1, 2};
		array = new int[] {0, 1, 2};
	}
}

//데이터타입[] 변수 = new 데이터타입[length]

/*
public 공개돼있다
static - 객체생성없이 call됨
void - 실행끝난다음에 리턴없음
main - 메소드이름
*/

/*
일반객체에서는 멤버변수를 일일이 선언
배열에서는 멤버변수, 멤버변수명을 자동으로 생성해줌.

일반객체에서는 데이터타입이 제각각.
배열객체에 들어가있는 데이터타입은 하나로 정해져있다.

데이터를 차례차례 넣고 차례차례 읽어낸다.


literating 하는작업 많아서 문법으로 생김 => for each문법
*/