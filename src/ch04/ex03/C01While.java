package ch04.ex03;

public class C01While {
	public static void main(String[] args) {
		int weight = 88;
		int jumpCnt = 0;
		
		//조건문이 false가 나올때까지 계속 실행
		while(weight > 60) {
			jumpCnt++;
			weight--;
		}                                                                                                                                                                                                                                                                                                                                                                                    
		
		System.out.printf("%d번 줄넘기 해서, 몸무게 %dkg이 되었습니다.", jumpCnt, weight);
	}
}
//while은 조건문이 false가 나올떄까지 계속 실행한다.