package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1); //오토박싱되서 인티저안에 들어감.
		set.add(2);
		set.add(3);
		set.add(1); //알아서 중복제거해준다.
		
		System.out.println(set);
	}
}


/*
set은 집합

특징 - 원소가 유일하다
밸류가 중복되지 않는다. 키(인덱스)가 없음
밸류만 가지고 함.
알아서 중복제거해준다.
저장순서가 없어서 저장할떄의 순서대로 출력이 안됨.
*/