package ch04.ex03;

public class C02DrawingLots {
	public static void main(String[] args) {
		int random = 1;
		int pickCnt = 0;
		//1~100 중에 3의 배수가 나오면 stop
		while(random % 3 != 0) {
			random = (int)(Math.random() * 100) + 1;
			pickCnt++;
		}
		System.out.printf("%d회 뽑아서, %d를 찾았습니다.", pickCnt, random);
	}
}	
//경우의수가 많으면 패턴화
/*
3의 배수를 뽑을 때까지, 계속 뽑아야지.
-> 3의 배수가 아니면, 뽑아야지.
x % 3 == 0
*/