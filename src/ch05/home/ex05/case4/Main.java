package ch05.home.ex05.case4;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();
		//�ؿ� �κ��� �ڱ�Ұ��� �Ѱ����� �Ѵ�.
		man.setName("���Ѽ�");
		man.setAge(33);
		man.setBirth(LocalDate.of(2025, 6, 7));
		
		man.sing();
		man.eat();
		man.run();
	} 
}

/*
����]
���ڸ��� ��ü�� �������϶�.

�Ĵ翡�� �� ���ڰ� �ٰ��� �ɽ��ϴ�.
���ڰ� �ڱ�Ұ��� �մϴ�.
�̸��� ���Ѽ�, ���̴� 33��, ������ 2025-6-7 �Դϴ�.

���ڴ� ������ ��ٸ��� ����, �뷡�� �θ��ϴ�.
������ ������ ���ְ� �Խ��ϴ�.
�� �Դ���, ��� ���ϰ� �޷������ϴ�.
*/