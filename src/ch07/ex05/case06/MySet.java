package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1); //����ڽ̵Ǽ� ��Ƽ���ȿ� ��.
		set.add(2);
		set.add(3);
		set.add(1); //�˾Ƽ� �ߺ��������ش�.
		
		System.out.println(set);
	}
}


/*
set�� ����

Ư¡ - ���Ұ� �����ϴ�
����� �ߺ����� �ʴ´�. Ű(�ε���)�� ����
����� ������ ��.
�˾Ƽ� �ߺ��������ش�.
��������� ��� �����ҋ��� ������� ����� �ȵ�.
*/