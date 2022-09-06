package ch07.ex02.presentation;

public interface Console {
	static void info(Object obj) { //파라미터 obj는 어떤객체는 다 obj로 프로모션되서 들어감.
		System.out.println(obj);
	}
}
