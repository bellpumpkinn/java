package ch05.ex05.case3;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2);
		System.out.println(result);
		
		Paper paper = new Paper(); //종이를 1장 마련했다.
		paper.setA(1);
		paper.setB(2);
		// Paper paper2 = calculator.add(paper); -> 종이를 2장했다고 오해 할수있다.
		paper = calculator.add(paper); //종이의 주소값을 복사해서 add(Paper paper)의 paper에 넘어간다.
		System.out.println(paper.getResult());
	}
}
//클래스타입의 변수에는 객체의 주소값이 들어감.