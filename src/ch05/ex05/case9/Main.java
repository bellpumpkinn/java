package ch05.ex05.case9;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setName("늠름이");
		
		
		Cat cat2 = cat1.breed();  //cat1이 낳은 새끼고양이를 cat2변수에 넣음.
		//엄마고양이랑 새끼고양이랑 개체가 다르니까 새로만들어줌.
		cat2.setName("튼튼이");
	}
}
//메서드탄생이유 - 중복코드최소화
//메서드콜만하면 되니까
