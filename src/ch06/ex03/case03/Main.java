package ch06.ex03.case03;

public class Main {
	public static void main(String[] args) {
		Duck duck = new Duck();
		Hen hen = new Hen();
		
		System.out.println(duck); //duck.toString이라 오리라고 나옴.
		System.out.println(hen);
	}
}
