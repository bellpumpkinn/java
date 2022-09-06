package ch05.ex04.case1;
//static변수
public class Card {
	public String kind; //instance변수
	public int number; //instance변수
	public static int width; //static변수
	public static int height; //static변수
}
//데이터를 여러객체가 공유하고 싶은경우 static
//n개의 카드가 폭 높이가 같음
//카드의 무늬 , 폭, 높이는 똑같은데이터더라
//static 으로 두고 같이씀
//static변수는 메서드에어리어에생김

