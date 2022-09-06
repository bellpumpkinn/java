package ch06.ex05.case01;

public class Shoes extends Product{
	private int price;
	
	
	public Shoes(int price) {   //이렇게 해야 3번줄이 에러가 안남.
		super(price); //여기서 product로 가서 2000원이 나옴.
		this.price = price; //슈즈에서 만들어진 price
	}
}

//객체타입은 멤버변수만.
//자식은 상속받으면 부모꺼 다 가진다. 그래서 여기선 price가 2개있음
