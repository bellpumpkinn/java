package ch05.ex09.case2;

public class Main {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone(1000); //300?????ε? ????Ⱑ ?ƴ?.
		Phone phone4 = new Phone();
		
		System.out.printf("%d, %d, %d, %d", 
				phone1.getSerial(), phone2.getSerial(), 
				phone3.getSerial(), phone4.getSerial());
	}
}
