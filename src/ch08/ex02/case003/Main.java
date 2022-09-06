package ch08.ex02.case003;

public class Main {
	public static void main(String[] args) {
		String name = Way.LEFT.name();
		//코드값을 알아내는것 = ordinal
		int ordinal = Way.LEFT.ordinal();
		
		System.out.printf("%s %d\n", name, ordinal);
		
		name = Way.RIGHT.name();
		ordinal = Way.RIGHT.ordinal();
		
		System.out.printf("%s %d\n", name, ordinal);
		
		//values는 배열을 이용해서 코드를 리턴해줌
		
		Way[] ways = Way.values();
		for(Way way: ways) System.out.print(way + " "); //print는 toString을 포함하는중.
		//for(Way way: ways) System.out.print(way.toString() + " "); 
		System.out.println();
		
		Way way = Way.valueOf("LEFT"); //코드명과 일치하는걸 리턴시켜준다.
		System.out.println(way); // println은 way의 toString을 호출함
	}
}


