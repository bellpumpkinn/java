package ch05.home.ex01.case1;

public class Main {
	public static void main(String[] args) {
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		
		flower1.name = "창포꽃"; //창포꽃, 7cm, 2cm를 멤버라고 한다.
		flower1.petalLength = 7; //위 3개 데이터가 객체 구성을 한다.
		flower1.cupLength = 2; //객체를 디자인 -> 멤버들을 조합하는거.
		
		flower2.name = "코스모스";
		flower2.petalLength = 4;
		flower2.cupLength = 1;
	}
}

/*
창포꽃은 꽃잎 길이가 7cm, 꽃받침 길이가 2cm입니다.
코스모스는 꽃잎 길이가 4cm, 꽃받침 길이가 1cm입니다.
*/

//멤버변수안에는 개체의 특징을 넣는다.