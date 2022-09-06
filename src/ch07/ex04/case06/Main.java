package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3]; //애니멀타입의 객체가 들어갈수있는 배열타입의 공간을 만들었음.
		
		animals[0] = new Cat("헤롱이");
		animals[1] = new Dog("왈왈이");
		animals[2] = new Dog("성큼이");
		
		for(Animal animal: animals) //동물을 꺼내라 라는 관점으로 접근
			System.out.println(animal);
		
		Object[] objs = new Object[3];
		objs[0] = new Cat("헤롱이"); //Cat이 오브젝트로 프로모션이 되서 할당이 된거.
		objs[1] = new Dog("왈왈이");
		objs[2] = new Dog("성큼이");
		
		for(Object obj: objs)       //Object로 안하는 이유
			System.out.println(obj); //동물이 들어와야하는데 차도 들어오고 엉뚱한데이터 들어올수있음
		
		//다양한타입의 객체를 받고 싶어서 제네릭(Generic)이 나왔음
		//메뉴정할때 아무거나에 해당하는게 제네릭
		
	}
}
