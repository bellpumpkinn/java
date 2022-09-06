package ch04.ex05;

public class C05TwoDigit {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 0; j < 10; j++)
				System.out.printf("%d%d\n", i, j);
		}
	}
}
/*
10  1의자리가 0~9까지가고 10 갈때 십의자리증가
11
12
13
14
15
16
17
18
19
20
21
*/