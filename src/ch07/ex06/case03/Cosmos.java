package ch07.ex06.case03;
//���丮�޼��� ����. Cosmos:����
public class Cosmos {
	public static Animal getAnimal(String animalName) { //factory method
		Animal animal = null;
		
		switch(animalName) {
		case"ȣ����": animal = new Tiger(); break;
		case"��": animal = new Falcon();
		}
		
		return animal;
	}
}

//������ ������ּ��� �ϰ� �̸��� ���ϸ� ���ְ� �������.
//cosmos���� �ִϸ��� �޶�� ��û