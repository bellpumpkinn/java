package ch05.ex04.case1;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d", Card.width, Card.height);
		
		Card.width = 10;
		Card.height = 20;
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("\n%s, %s\n", card1.kind, card2.kind);
		
		System.out.printf("\n%d, %d\n", Card.width, Card.height); //static변수면 이렇게 써라.
		System.out.printf("\n%d, %d\n", card1.width, card1.height); //static인데 이러면 경고뜸.
		
		card1.width = 100;
		System.out.printf("\n%d, %d\n", card1.width, card2.width);
	}
}
//Card.width => Card클래스에 있는 width이다.
//width, height는 필드(멤버변수)이기때문에 이미 초기값 0을 가지고있다.
//kind랑 number는 인스턴스변수라서 헤이트랑 윗뜨처럼 바로 쓰지못한다. 객체를 먼저 만들고 쓸수있음.
//static변수를 안쓰면 중복이 발생
//50개,100개 쓰면 width, height 데이터가 중복이 발생하니까 static변수 사용
//static변수쓰면 트레이드오프 생각해야함