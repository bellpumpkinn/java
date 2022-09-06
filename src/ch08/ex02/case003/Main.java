package ch08.ex02.case003;

public class Main {
	public static void main(String[] args) {
		String name = Way.LEFT.name();
		//�ڵ尪�� �˾Ƴ��°� = ordinal
		int ordinal = Way.LEFT.ordinal();
		
		System.out.printf("%s %d\n", name, ordinal);
		
		name = Way.RIGHT.name();
		ordinal = Way.RIGHT.ordinal();
		
		System.out.printf("%s %d\n", name, ordinal);
		
		//values�� �迭�� �̿��ؼ� �ڵ带 ��������
		
		Way[] ways = Way.values();
		for(Way way: ways) System.out.print(way + " "); //print�� toString�� �����ϴ���.
		//for(Way way: ways) System.out.print(way.toString() + " "); 
		System.out.println();
		
		Way way = Way.valueOf("LEFT"); //�ڵ��� ��ġ�ϴ°� ���Ͻ����ش�.
		System.out.println(way); // println�� way�� toString�� ȣ����
	}
}


