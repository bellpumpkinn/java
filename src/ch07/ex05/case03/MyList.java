package ch07.ex05.case03;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1); //1�̶�� ����� �������. Ű�� 0    ->����ڽ̵Ǽ� Integer������ ����
		list.add(2); //Ű�� �ε������ �����ϸ� ��.
		list.add(3);
		list.add(1); //1�̶�� ����� �Ȱ����� Ű�� 3�̶� ������ ����.
		
		System.out.println(list);
		
		for(int i: list)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0)); //�Ķ���ͷ� �ε���, �� Ű�� �Է�
		
		for(int i = 0; i < list.size(); i++)    //4���ϱ� list.size�� 4.
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		//remove
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.remove(i) + " ");
		System.out.println();
		
		//����] remove() list�� ��� ���Ҹ� �����϶�.
		/*
		int size = list.size();
		
		for(int i = 0; i < size; i++)
			list.remove(0); 
		System.out.println(list);*/
		for(int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		System.out.println(list);
		//3�����, 2�����, 1�����, 0�����
	}
}
//�迭�� ����Ҷ� ũ�⸦ �˰� ������ ������ϴµ� �׻� �� ũ�⸦ �˼��� ���⶧����( �л��� 5���س��µ� 2��� �߰��Ϸ��ϸ� ��ġ�� ������)
//�׷��� �̷��� �Ѱ踦 �غ��ϱ� ���� List�� ���Դ�. List�� �޸𸮰� ��밡������ ����ؼ� �л��� �߰� ����.
/*
����Ʈ�� Ű, ����� �����ϸ��.   Ű�� �ε����� �����ϸ��.
add�� �����͸� ����ְ� , get���� �����͸� �о���.
�����͸� ������ ������ ������ remove��� �޼��带 �̿�.
*/