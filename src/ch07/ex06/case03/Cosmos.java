package ch07.ex06.case03;
//팩토리메서드 등장. Cosmos:우주
public class Cosmos {
	public static Animal getAnimal(String animalName) { //factory method
		Animal animal = null;
		
		switch(animalName) {
		case"호랑이": animal = new Tiger(); break;
		case"매": animal = new Falcon();
		}
		
		return animal;
	}
}

//누군가 만들어주세요 하고 이름을 말하면 우주가 만들어줌.
//cosmos한테 애니멀을 달라고 요청